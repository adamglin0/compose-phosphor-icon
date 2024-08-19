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

public val LightGroup.`Wind-light`: ImageVector
    get() {
        if (`_wind-light` != null) {
            return `_wind-light`!!
        }
        `_wind-light` = Builder(name = "Wind-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.0f, 184.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, 30.0f)
                curveToRelative(-12.9f, 0.0f, -25.36f, -8.38f, -29.63f, -19.92f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.26f, -4.16f)
                curveTo(136.13f, 196.69f, 144.2f, 202.0f, 152.0f, 202.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 0.0f, -36.0f)
                lineTo(40.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(152.0f, 154.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 182.0f, 184.0f)
                close()
                moveTo(150.0f, 72.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -30.0f, -30.0f)
                curveToRelative(-12.9f, 0.0f, -25.36f, 8.38f, -29.63f, 19.92f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.26f, 4.16f)
                curveTo(104.13f, 59.31f, 112.2f, 54.0f, 120.0f, 54.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 36.0f)
                lineTo(24.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 150.0f, 72.0f)
                close()
                moveTo(208.0f, 74.0f)
                curveToRelative(-12.9f, 0.0f, -25.36f, 8.38f, -29.63f, 19.92f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.26f, 4.16f)
                curveTo(192.13f, 91.31f, 200.2f, 86.0f, 208.0f, 86.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 36.0f)
                lineTo(32.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(208.0f, 134.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -60.0f)
                close()
            }
        }
        .build()
        return `_wind-light`!!
    }

private var `_wind-light`: ImageVector? = null
