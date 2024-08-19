package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`At-light`: ImageVector
    get() {
        if (`_at-light` != null) {
            return `_at-light`!!
        }
        `_at-light` = Builder(name = "At-light", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, 0.0f, 204.0f)
                curveToRelative(21.13f, 0.0f, 43.31f, -6.35f, 59.32f, -17.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.65f, -10.0f)
                curveToRelative(-13.9f, 9.25f, -34.09f, 15.0f, -52.67f, 15.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                curveToRelative(0.0f, 29.58f, -13.78f, 34.0f, -22.0f, 34.0f)
                reflectiveCurveToRelative(-22.0f, -4.42f, -22.0f, -34.0f)
                lineTo(174.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 4.34f, 56.32f)
                curveTo(171.76f, 166.6f, 182.0f, 174.0f, 196.0f, 174.0f)
                curveToRelative(21.29f, 0.0f, 34.0f, -17.2f, 34.0f, -46.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 128.0f, 162.0f)
                close()
            }
        }
        .build()
        return `_at-light`!!
    }

private var `_at-light`: ImageVector? = null
