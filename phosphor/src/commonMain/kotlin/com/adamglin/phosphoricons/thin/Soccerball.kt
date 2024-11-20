package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) {
            return _soccerBall!!
        }
        _soccerBall = Builder(name = "SoccerBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(168.87f, 175.42f)
                lineTo(157.18f, 159.33f)
                lineTo(171.13f, 118.69f)
                lineTo(190.06f, 112.54f)
                lineTo(219.71f, 135.28f)
                arcToRelative(91.32f, 91.32f, 0.0f, false, true, -12.9f, 40.14f)
                close()
                moveTo(87.13f, 175.42f)
                lineTo(49.19f, 175.42f)
                arcToRelative(91.32f, 91.32f, 0.0f, false, true, -12.9f, -40.14f)
                lineToRelative(29.65f, -22.74f)
                lineToRelative(18.93f, 6.15f)
                lineToRelative(13.95f, 40.64f)
                close()
                moveTo(51.69f, 76.66f)
                lineToRelative(8.87f, 29.92f)
                lineTo(36.0f, 125.39f)
                arcTo(91.41f, 91.41f, 0.0f, false, true, 51.69f, 76.66f)
                close()
                moveTo(106.13f, 156.0f)
                lineTo(92.77f, 117.08f)
                lineTo(128.0f, 92.85f)
                lineToRelative(35.23f, 24.23f)
                lineTo(149.87f, 156.0f)
                close()
                moveTo(195.44f, 106.58f)
                lineTo(204.31f, 76.66f)
                arcTo(91.41f, 91.41f, 0.0f, false, true, 220.0f, 125.39f)
                close()
                moveTo(198.31f, 68.74f)
                lineTo(187.59f, 104.93f)
                lineTo(168.59f, 111.09f)
                lineTo(132.0f, 85.9f)
                lineTo(132.0f, 66.1f)
                lineToRelative(32.68f, -22.46f)
                arcTo(92.44f, 92.44f, 0.0f, false, true, 198.31f, 68.74f)
                close()
                moveTo(155.54f, 40.21f)
                lineTo(128.0f, 59.15f)
                lineTo(100.46f, 40.21f)
                arcToRelative(92.18f, 92.18f, 0.0f, false, true, 55.08f, 0.0f)
                close()
                moveTo(91.32f, 43.64f)
                lineTo(124.0f, 66.1f)
                lineTo(124.0f, 85.9f)
                lineTo(87.36f, 111.09f)
                lineToRelative(-19.0f, -6.16f)
                lineTo(57.69f, 68.74f)
                arcTo(92.44f, 92.44f, 0.0f, false, true, 91.32f, 43.64f)
                close()
                moveTo(54.61f, 183.42f)
                lineTo(86.34f, 183.42f)
                lineToRelative(11.1f, 31.36f)
                arcTo(92.46f, 92.46f, 0.0f, false, true, 54.61f, 183.42f)
                close()
                moveTo(106.91f, 217.56f)
                lineTo(93.64f, 180.06f)
                lineTo(105.32f, 164.0f)
                horizontalLineToRelative(45.36f)
                lineToRelative(11.68f, 16.06f)
                lineToRelative(-13.27f, 37.5f)
                arcToRelative(92.37f, 92.37f, 0.0f, false, true, -42.18f, 0.0f)
                close()
                moveTo(158.56f, 214.78f)
                lineTo(169.66f, 183.42f)
                horizontalLineToRelative(31.73f)
                arcTo(92.46f, 92.46f, 0.0f, false, true, 158.56f, 214.78f)
                close()
            }
        }
        .build()
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
