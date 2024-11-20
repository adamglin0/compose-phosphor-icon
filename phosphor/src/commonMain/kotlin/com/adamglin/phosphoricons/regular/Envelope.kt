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

public val RegularGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                lineTo(32.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(24.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 48.0f)
                close()
                moveTo(128.0f, 133.15f)
                lineTo(52.57f, 64.0f)
                lineTo(203.43f, 64.0f)
                close()
                moveTo(98.71f, 128.0f)
                lineTo(40.0f, 181.81f)
                lineTo(40.0f, 74.19f)
                close()
                moveTo(110.55f, 138.85f)
                lineTo(122.55f, 149.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.82f, 0.0f)
                lineToRelative(12.0f, -11.05f)
                lineToRelative(58.0f, 53.15f)
                lineTo(52.57f, 192.0f)
                close()
                moveTo(157.29f, 128.0f)
                lineTo(216.0f, 74.18f)
                lineTo(216.0f, 181.82f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
