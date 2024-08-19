package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Soccerball: ImageVector
    get() {
        if (_soccerball != null) {
            return _soccerball!!
        }
        _soccerball = Builder(name = "Soccerball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
        return _soccerball!!
    }

private var _soccerball: ImageVector? = null
