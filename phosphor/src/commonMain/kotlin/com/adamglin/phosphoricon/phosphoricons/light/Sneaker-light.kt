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

public val LightGroup.`Sneaker-light`: ImageVector
    get() {
        if (`_sneaker-light` != null) {
            return `_sneaker-light`!!
        }
        `_sneaker-light` = Builder(name = "Sneaker-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 131.0f)
                lineToRelative(-60.73f, -20.24f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -15.51f, -14.0f)
                lineTo(128.51f, 42.31f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -17.57f, -7.47f)
                lineTo(35.22f, 62.37f)
                arcTo(14.05f, 14.05f, 0.0f, false, false, 26.0f, 75.53f)
                verticalLineTo(192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(240.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(167.06f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 228.0f, 131.0f)
                close()
                moveTo(39.32f, 73.65f)
                lineTo(115.0f, 46.12f)
                arcToRelative(1.81f, 1.81f, 0.0f, false, true, 0.68f, -0.12f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.79f, 1.11f)
                lineToRelative(8.0f, 18.68f)
                lineTo(102.0f, 74.36f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 86.0f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, 2.0f, -0.37f)
                lineToRelative(24.18f, -8.79f)
                lineToRelative(6.31f, 14.76f)
                lineTo(118.0f, 98.36f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 120.0f, 110.0f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, false, 2.0f, -0.36f)
                lineToRelative(19.26f, -7.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 10.57f, 13.21f)
                lineTo(134.0f, 122.36f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 136.0f, 134.0f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, false, 2.05f, -0.36f)
                lineToRelative(28.64f, -10.42f)
                lineToRelative(57.53f, 19.18f)
                arcTo(25.94f, 25.94f, 0.0f, false, true, 241.49f, 162.0f)
                horizontalLineTo(38.0f)
                verticalLineTo(75.53f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 39.32f, 73.65f)
                close()
                moveTo(240.0f, 194.0f)
                horizontalLineTo(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(174.0f)
                horizontalLineTo(242.0f)
                verticalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 240.0f, 194.0f)
                close()
            }
        }
        .build()
        return `_sneaker-light`!!
    }

private var `_sneaker-light`: ImageVector? = null
