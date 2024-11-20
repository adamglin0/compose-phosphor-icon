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

public val RegularGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.1f, 62.59f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -140.2f, 0.0f)
                arcTo(71.71f, 71.71f, 0.0f, false, false, 16.0f, 127.8f)
                curveTo(15.9f, 166.0f, 48.0f, 199.0f, 86.14f, 200.0f)
                arcTo(72.09f, 72.09f, 0.0f, false, false, 120.0f, 192.47f)
                verticalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(192.47f)
                arcTo(72.17f, 72.17f, 0.0f, false, false, 168.0f, 200.0f)
                lineToRelative(1.82f, 0.0f)
                curveTo(208.0f, 199.0f, 240.11f, 166.0f, 240.0f, 127.8f)
                arcTo(71.71f, 71.71f, 0.0f, false, false, 198.1f, 62.59f)
                close()
                moveTo(169.45f, 184.0f)
                arcToRelative(56.08f, 56.08f, 0.0f, false, true, -33.45f, -10.0f)
                verticalLineToRelative(-41.0f)
                lineToRelative(43.58f, -21.78f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, -14.32f)
                lineTo(136.0f, 115.06f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(51.06f)
                lineTo(83.58f, 120.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, 14.32f)
                lineTo(120.0f, 156.94f)
                verticalLineToRelative(17.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -33.45f, 10.0f)
                curveTo(56.9f, 183.23f, 31.92f, 157.52f, 32.0f, 127.84f)
                arcTo(55.77f, 55.77f, 0.0f, false, true, 67.11f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.53f, -4.67f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 112.72f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 188.89f, 76.0f)
                arcTo(55.79f, 55.79f, 0.0f, false, true, 224.0f, 127.84f)
                curveTo(224.08f, 157.52f, 199.1f, 183.23f, 169.45f, 184.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
