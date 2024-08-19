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

public val FillGroup.Openailogo: ImageVector
    get() {
        if (_openailogo != null) {
            return _openailogo!!
        }
        _openailogo = Builder(name = "Openailogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.32f, 114.24f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -60.07f, -76.57f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 67.93f, 51.44f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -36.25f, 90.32f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 69.0f, 217.0f)
                arcTo(56.39f, 56.39f, 0.0f, false, false, 83.59f, 219.0f)
                arcToRelative(55.75f, 55.75f, 0.0f, false, false, 8.17f, -0.61f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 96.31f, -13.78f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 36.25f, -90.32f)
                close()
                moveTo(144.0f, 137.24f)
                lineTo(128.0f, 146.48f)
                lineTo(112.0f, 137.24f)
                lineTo(112.0f, 118.76f)
                lineToRelative(16.0f, -9.24f)
                lineToRelative(16.0f, 9.24f)
                close()
                moveTo(182.85f, 54.43f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 28.56f, 48.0f)
                curveToRelative(-0.95f, -0.63f, -1.91f, -1.24f, -2.91f, -1.81f)
                lineTo(164.0f, 74.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineToRelative(-44.0f, 25.41f)
                lineTo(112.0f, 81.81f)
                lineToRelative(40.5f, -23.38f)
                arcTo(39.76f, 39.76f, 0.0f, false, true, 182.85f, 54.43f)
                close()
                moveTo(40.85f, 86.93f)
                arcTo(39.75f, 39.75f, 0.0f, false, true, 64.12f, 68.57f)
                curveTo(64.05f, 69.71f, 64.0f, 70.85f, 64.0f, 72.0f)
                verticalLineToRelative(51.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 6.93f)
                lineToRelative(44.0f, 25.4f)
                lineTo(96.0f, 165.0f)
                lineTo(55.5f, 141.57f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 40.86f, 86.93f)
                close()
                moveTo(136.0f, 224.0f)
                arcToRelative(39.79f, 39.79f, 0.0f, false, true, -27.52f, -10.95f)
                curveToRelative(1.0f, -0.51f, 2.0f, -1.05f, 3.0f, -1.63f)
                lineTo(156.0f, 185.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -6.92f)
                lineTo(160.0f, 128.0f)
                lineToRelative(16.0f, 9.24f)
                lineTo(176.0f, 184.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 136.0f, 224.0f)
                close()
            }
        }
        .build()
        return _openailogo!!
    }

private var _openailogo: ImageVector? = null
