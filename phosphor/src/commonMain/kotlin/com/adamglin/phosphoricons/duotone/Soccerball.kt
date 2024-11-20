package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) {
            return _soccerBall!!
        }
        _soccerBall = Builder(name = "SoccerBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(65.17f, 108.08f)
                lineToRelative(-33.0f, 25.34f)
                curveToRelative(-0.1f, -1.8f, -0.15f, -3.6f, -0.15f, -5.42f)
                arcTo(95.61f, 95.61f, 0.0f, false, true, 53.23f, 67.78f)
                close()
                moveTo(46.92f, 179.42f)
                arcToRelative(96.12f, 96.12f, 0.0f, false, false, 57.0f, 41.52f)
                lineToRelative(-14.7f, -41.52f)
                close()
                moveTo(152.13f, 220.94f)
                arcToRelative(96.12f, 96.12f, 0.0f, false, false, 57.0f, -41.52f)
                lineTo(166.83f, 179.42f)
                close()
                moveTo(202.77f, 67.78f)
                lineToRelative(-11.94f, 40.3f)
                lineToRelative(33.0f, 25.34f)
                curveToRelative(0.1f, -1.8f, 0.15f, -3.6f, 0.15f, -5.42f)
                arcTo(95.61f, 95.61f, 0.0f, false, false, 202.77f, 67.78f)
                close()
                moveTo(164.25f, 39.08f)
                arcToRelative(96.34f, 96.34f, 0.0f, false, false, -72.5f, 0.0f)
                lineTo(128.0f, 64.0f)
                close()
                moveTo(152.72f, 160.0f)
                lineTo(168.0f, 115.5f)
                lineTo(128.0f, 88.0f)
                lineTo(88.0f, 115.5f)
                lineTo(103.28f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(204.52f, 171.42f)
                lineTo(170.9f, 171.42f)
                lineToRelative(-9.26f, -12.76f)
                lineToRelative(12.63f, -36.78f)
                lineToRelative(15.0f, -4.89f)
                lineToRelative(26.24f, 20.13f)
                arcTo(87.38f, 87.38f, 0.0f, false, true, 204.52f, 171.42f)
                close()
                moveTo(40.52f, 137.12f)
                lineTo(66.71f, 117.0f)
                lineToRelative(15.0f, 4.89f)
                lineToRelative(12.63f, 36.78f)
                lineTo(85.1f, 171.42f)
                lineTo(51.48f, 171.42f)
                arcTo(87.38f, 87.38f, 0.0f, false, true, 40.47f, 137.12f)
                close()
                moveTo(50.52f, 86.48f)
                lineTo(56.03f, 105.08f)
                lineTo(40.71f, 116.77f)
                arcTo(87.33f, 87.33f, 0.0f, false, true, 50.43f, 86.48f)
                close()
                moveTo(109.0f, 152.0f)
                lineTo(97.54f, 118.65f)
                lineTo(128.0f, 97.71f)
                lineToRelative(30.46f, 20.94f)
                lineTo(147.0f, 152.0f)
                close()
                moveTo(200.07f, 105.08f)
                lineTo(205.58f, 86.48f)
                arcToRelative(87.33f, 87.33f, 0.0f, false, true, 9.72f, 30.29f)
                close()
                moveTo(193.87f, 69.7f)
                lineTo(184.36f, 101.78f)
                lineTo(169.29f, 106.67f)
                lineTo(136.0f, 83.79f)
                lineTo(136.0f, 68.21f)
                lineToRelative(29.09f, -20.0f)
                arcTo(88.58f, 88.58f, 0.0f, false, true, 193.86f, 69.7f)
                close()
                moveTo(146.07f, 41.87f)
                lineTo(128.0f, 54.29f)
                lineTo(109.93f, 41.87f)
                arcToRelative(88.24f, 88.24f, 0.0f, false, true, 36.14f, 0.0f)
                close()
                moveTo(90.91f, 48.21f)
                lineToRelative(29.09f, 20.0f)
                lineTo(120.0f, 83.79f)
                lineTo(86.72f, 106.67f)
                lineToRelative(-15.07f, -4.89f)
                lineTo(62.14f, 69.7f)
                arcTo(88.58f, 88.58f, 0.0f, false, true, 90.91f, 48.21f)
                close()
                moveTo(63.15f, 187.42f)
                lineTo(83.52f, 187.42f)
                lineToRelative(7.17f, 20.27f)
                arcTo(88.4f, 88.4f, 0.0f, false, true, 63.15f, 187.42f)
                close()
                moveTo(110.0f, 214.13f)
                lineTo(98.12f, 180.71f)
                lineTo(107.35f, 168.0f)
                horizontalLineToRelative(41.3f)
                lineToRelative(9.23f, 12.71f)
                lineToRelative(-11.83f, 33.42f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -36.1f, 0.0f)
                close()
                moveTo(165.36f, 207.69f)
                lineTo(172.53f, 187.42f)
                horizontalLineToRelative(20.37f)
                arcTo(88.4f, 88.4f, 0.0f, false, true, 165.31f, 207.69f)
                close()
            }
        }
        .build()
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
