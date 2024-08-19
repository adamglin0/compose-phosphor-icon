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

public val LightGroup.`Shooting-star-light`: ImageVector
    get() {
        if (`_shooting-star-light` != null) {
            return `_shooting-star-light`!!
        }
        `_shooting-star-light` = Builder(name = "Shooting-star-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.45f, 70.69f)
                arcToRelative(11.42f, 11.42f, 0.0f, false, false, -10.0f, -7.9f)
                lineToRelative(-38.16f, -3.0f)
                lineTo(174.59f, 25.0f)
                arcToRelative(11.51f, 11.51f, 0.0f, false, false, -21.18f, 0.0f)
                lineTo(138.73f, 59.78f)
                lineToRelative(-38.15f, 3.0f)
                arcToRelative(11.39f, 11.39f, 0.0f, false, false, -6.53f, 20.06f)
                lineToRelative(29.0f, 24.48f)
                lineToRelative(-8.86f, 36.59f)
                arcToRelative(11.35f, 11.35f, 0.0f, false, false, 4.34f, 11.83f)
                arcToRelative(11.51f, 11.51f, 0.0f, false, false, 12.78f, 0.58f)
                lineTo(164.0f, 136.66f)
                lineToRelative(32.69f, 19.67f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 12.77f, -0.58f)
                arcToRelative(11.33f, 11.33f, 0.0f, false, false, 4.34f, -11.83f)
                lineTo(205.0f, 107.33f)
                lineToRelative(29.0f, -24.48f)
                arcTo(11.32f, 11.32f, 0.0f, false, false, 237.45f, 70.69f)
                close()
                moveTo(194.37f, 100.56f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, 6.0f)
                lineToRelative(9.41f, 38.86f)
                lineTo(167.1f, 124.52f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.19f, 0.0f)
                lineToRelative(-34.72f, 20.89f)
                lineToRelative(9.41f, -38.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, -6.0f)
                lineTo(102.94f, 74.65f)
                lineToRelative(40.37f, -3.19f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.06f, -3.65f)
                lineToRelative(15.63f, -37.0f)
                lineToRelative(15.63f, 37.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.06f, 3.65f)
                lineToRelative(40.37f, 3.19f)
                close()
                moveTo(86.69f, 121.79f)
                lineTo(28.24f, 180.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(58.45f, -58.45f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                close()
                moveTo(97.51f, 174.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.49f)
                lineTo(44.24f, 236.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(89.0f, 174.49f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 97.51f, 174.49f)
                close()
                moveTo(170.51f, 173.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-54.29f, 54.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(162.0f, 173.48f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 170.53f, 173.48f)
                close()
            }
        }
        .build()
        return `_shooting-star-light`!!
    }

private var `_shooting-star-light`: ImageVector? = null
