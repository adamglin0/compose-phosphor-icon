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

public val FillGroup.Phonetransfer: ImageVector
    get() {
        if (_phonetransfer != null) {
            return _phonetransfer!!
        }
        _phonetransfer = Builder(name = "Phonetransfer", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(52.69f)
                lineTo(178.34f, 45.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(196.69f, 80.0f)
                lineTo(144.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 72.0f)
                close()
                moveTo(214.36f, 166.46f)
                lineTo(167.25f, 145.35f)
                lineTo(167.14f, 145.29f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.18f, 1.4f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, false, -0.75f, 0.56f)
                lineTo(126.87f, 168.0f)
                curveToRelative(-15.42f, -7.49f, -31.34f, -23.29f, -38.83f, -38.51f)
                lineToRelative(20.78f, -24.71f)
                curveToRelative(0.2f, -0.25f, 0.39f, -0.5f, 0.57f, -0.77f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.32f, -15.06f)
                lineToRelative(0.0f, -0.12f)
                lineTo(89.54f, 41.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.62f, -9.51f)
                arcTo(56.24f, 56.24f, 0.0f, false, false, 24.0f, 88.0f)
                curveToRelative(0.0f, 79.4f, 64.6f, 144.0f, 144.0f, 144.0f)
                arcToRelative(56.24f, 56.24f, 0.0f, false, false, 55.87f, -48.92f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 214.36f, 166.46f)
                close()
            }
        }
        .build()
        return _phonetransfer!!
    }

private var _phonetransfer: ImageVector? = null
