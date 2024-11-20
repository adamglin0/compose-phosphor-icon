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

public val FillGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.38f, 229.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.54f)
                lineToRelative(-30.92f, -34.0f)
                arcTo(78.83f, 78.83f, 0.0f, false, true, 136.0f, 207.59f)
                lineTo(136.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 207.6f)
                arcTo(80.11f, 80.11f, 0.0f, false, true, 48.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                arcToRelative(63.41f, 63.41f, 0.0f, false, false, 32.21f, -8.68f)
                lineToRelative(-11.1f, -12.2f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 80.0f, 128.0f)
                lineTo(80.0f, 95.09f)
                lineTo(42.08f, 53.38f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 53.92f, 42.62f)
                lineToRelative(160.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.38f, 229.92f)
                close()
                moveTo(189.19f, 166.79f)
                arcToRelative(7.88f, 7.88f, 0.0f, false, false, 3.51f, 0.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.19f, -4.49f)
                arcTo(79.16f, 79.16f, 0.0f, false, false, 208.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(63.32f, 63.32f, 0.0f, false, true, -6.48f, 28.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 189.19f, 166.79f)
                close()
                moveTo(161.86f, 137.57f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 175.74f, 133.0f)
                arcToRelative(49.49f, 49.49f, 0.0f, false, false, 0.26f, -5.0f)
                lineTo(176.0f, 64.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 84.0f, 44.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.41f, 8.57f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
