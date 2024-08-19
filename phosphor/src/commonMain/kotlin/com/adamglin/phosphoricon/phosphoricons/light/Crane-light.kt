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

public val LightGroup.`Crane-light`: ImageVector
    get() {
        if (`_crane-light` != null) {
            return `_crane-light`!!
        }
        `_crane-light` = Builder(name = "Crane-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.09f, 18.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.91f, -0.15f)
                lineTo(102.5f, 82.0f)
                lineTo(32.0f, 82.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 96.0f)
                lineTo(18.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(134.0f, 168.0f)
                arcToRelative(6.28f, 6.28f, 0.0f, false, false, -0.25f, -1.72f)
                lineTo(111.16f, 91.0f)
                lineTo(218.0f, 34.0f)
                lineTo(218.0f, 160.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(200.0f, 162.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 227.09f, 18.86f)
                close()
                moveTo(99.54f, 94.0f)
                lineToRelative(20.4f, 68.0f)
                lineTo(62.0f, 162.0f)
                lineTo(62.0f, 94.0f)
                close()
                moveTo(32.0f, 94.0f)
                lineTo(50.0f, 94.0f)
                verticalLineToRelative(68.0f)
                lineTo(30.0f, 162.0f)
                lineTo(30.0f, 96.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 32.0f, 94.0f)
                close()
                moveTo(120.0f, 202.0f)
                lineTo(32.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 174.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(26.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 120.0f, 202.0f)
                close()
            }
        }
        .build()
        return `_crane-light`!!
    }

private var `_crane-light`: ImageVector? = null
