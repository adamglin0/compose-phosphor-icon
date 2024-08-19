package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Waveform: ImageVector
    get() {
        if (_waveform != null) {
            return _waveform!!
        }
        _waveform = Builder(name = "Waveform", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(36.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(88.0f, 20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 32.0f)
                lineTo(76.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(100.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 20.0f)
                close()
                moveTo(128.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(116.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 52.0f)
                close()
                moveTo(168.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(180.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 84.0f)
                close()
                moveTo(208.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(220.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 68.0f)
                close()
            }
        }
        .build()
        return _waveform!!
    }

private var _waveform: ImageVector? = null
