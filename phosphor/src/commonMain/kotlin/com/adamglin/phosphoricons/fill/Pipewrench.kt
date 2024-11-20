package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.PipeWrench: ImageVector
    get() {
        if (_pipeWrench != null) {
            return _pipeWrench!!
        }
        _pipeWrench = Builder(name = "PipeWrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.28f, 55.0f)
                lineToRelative(-0.17f, -0.17f)
                lineToRelative(-44.9f, -42.28f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.5f, 0.08f)
                lineTo(108.17f, 56.87f)
                lineToRelative(-1.54f, -1.56f)
                arcTo(25.0f, 25.0f, 0.0f, false, false, 71.27f, 90.58f)
                lineToRelative(1.46f, 1.48f)
                lineTo(52.69f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(12.68f, 12.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.59f, 0.0f)
                lineToRelative(19.93f, -19.65f)
                lineTo(120.0f, 140.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.0f, 0.0f)
                lineTo(55.31f, 205.37f)
                arcToRelative(25.0f, 25.0f, 0.0f, true, false, 35.34f, 35.29f)
                lineToRelative(88.67f, -89.35f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.6f)
                lineTo(143.63f, 92.66f)
                lineTo(156.56f, 80.0f)
                lineToRelative(0.1f, 0.09f)
                lineTo(194.0f, 115.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.53f, -0.09f)
                lineToRelative(3.71f, -3.71f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -56.57f)
                close()
                moveTo(76.69f, 136.0f)
                lineTo(64.0f, 123.33f)
                lineToRelative(20.0f, -19.88f)
                lineToRelative(12.69f, 12.86f)
                close()
                moveTo(209.0f, 100.28f)
                lineTo(205.25f, 104.0f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, -0.16f, -0.16f)
                lineTo(167.69f, 68.5f)
                arcToRelative(16.05f, 16.05f, 0.0f, false, false, -22.39f, 0.12f)
                lineTo(132.37f, 81.29f)
                lineTo(119.43f, 68.23f)
                lineTo(164.0f, 24.0f)
                lineToRelative(0.17f, 0.16f)
                lineToRelative(44.88f, 42.26f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -0.08f, 33.86f)
                close()
            }
        }
        .build()
        return _pipeWrench!!
    }

private var _pipeWrench: ImageVector? = null
