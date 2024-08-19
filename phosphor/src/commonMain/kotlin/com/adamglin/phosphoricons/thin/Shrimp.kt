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

public val ThinGroup.Shrimp: ImageVector
    get() {
        if (_shrimp != null) {
            return _shrimp!!
        }
        _shrimp = Builder(name = "Shrimp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 116.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 140.0f, 116.0f)
                close()
                moveTo(219.93f, 82.65f)
                arcTo(76.07f, 76.07f, 0.0f, false, true, 144.0f, 156.0f)
                lineTo(112.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(116.0f, 196.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(96.0f, 228.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 96.0f, 76.0f)
                lineTo(212.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                lineTo(128.0f, 44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 7.93f, 46.65f)
                close()
                moveTo(50.47f, 202.46f)
                lineToRelative(37.78f, -27.0f)
                arcTo(24.75f, 24.75f, 0.0f, false, true, 88.0f, 172.0f)
                arcToRelative(23.85f, 23.85f, 0.0f, false, true, 2.0f, -9.6f)
                lineToRelative(-59.9f, -27.23f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 20.36f, 67.29f)
                close()
                moveTo(90.9f, 183.46f)
                lineTo(57.0f, 207.64f)
                arcTo(67.59f, 67.59f, 0.0f, false, false, 96.0f, 220.0f)
                horizontalLineToRelative(12.0f)
                lineTo(108.0f, 195.66f)
                arcTo(24.07f, 24.07f, 0.0f, false, true, 90.9f, 183.42f)
                close()
                moveTo(108.0f, 148.34f)
                lineTo(108.0f, 84.0f)
                lineTo(96.0f, 84.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, -63.42f, 43.51f)
                lineToRelative(61.89f, 28.13f)
                arcTo(23.94f, 23.94f, 0.0f, false, true, 108.0f, 148.34f)
                close()
                moveTo(211.88f, 84.0f)
                lineTo(116.0f, 84.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(28.0f)
                arcTo(68.08f, 68.08f, 0.0f, false, false, 211.88f, 84.0f)
                close()
            }
        }
        .build()
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
