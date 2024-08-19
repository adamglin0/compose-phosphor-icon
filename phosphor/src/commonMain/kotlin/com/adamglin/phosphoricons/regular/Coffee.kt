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

public val RegularGroup.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 56.0f)
                lineTo(80.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(120.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(128.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(112.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 64.0f)
                close()
                moveTo(152.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(160.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(144.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 64.0f)
                close()
                moveTo(248.0f, 120.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -37.51f, 39.91f)
                arcToRelative(96.59f, 96.59f, 0.0f, false, true, -27.0f, 40.09f)
                lineTo(208.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(32.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(56.54f, 208.0f)
                arcTo(96.3f, 96.3f, 0.0f, false, true, 24.0f, 136.0f)
                lineTo(24.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(208.0f, 80.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 248.0f, 120.0f)
                close()
                moveTo(200.0f, 96.0f)
                lineTo(40.0f, 96.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(80.27f, 80.27f, 0.0f, false, false, 45.12f, 72.0f)
                horizontalLineToRelative(69.76f)
                arcTo(80.27f, 80.27f, 0.0f, false, false, 200.0f, 136.0f)
                close()
                moveTo(232.0f, 120.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -16.0f, -22.62f)
                lineTo(216.0f, 136.0f)
                arcToRelative(95.78f, 95.78f, 0.0f, false, true, -1.2f, 15.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 232.0f, 128.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
