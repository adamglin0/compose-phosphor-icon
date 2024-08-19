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

public val FillGroup.Screencast: ImageVector
    get() {
        if (_screencast != null) {
            return _screencast!!
        }
        _screencast = Builder(name = "Screencast", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.24f, 8.0f)
                arcTo(8.28f, 8.28f, 0.0f, false, true, 40.0f, 207.76f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.24f, 200.0f)
                arcTo(8.28f, 8.28f, 0.0f, false, true, 24.0f, 192.24f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 184.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 56.0f, 208.0f)
                close()
                moveTo(32.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.65f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 32.24f, 168.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 72.0f, 207.76f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 79.36f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 208.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 32.0f, 152.0f)
                close()
                moveTo(32.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.6f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, false, 8.3f, 7.4f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 104.0f, 207.68f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, false, 7.4f, 8.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.6f, -8.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 32.0f, 120.0f)
                close()
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineToRelative(44.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.15f, 4.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 135.93f, 211.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.15f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
            }
        }
        .build()
        return _screencast!!
    }

private var _screencast: ImageVector? = null
