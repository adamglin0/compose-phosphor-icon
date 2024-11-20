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

public val RegularGroup.Hoodie: ImageVector
    get() {
        if (_hoodie != null) {
            return _hoodie!!
        }
        _hoodie = Builder(name = "Hoodie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.31f, 120.53f)
                lineTo(183.0f, 39.12f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 169.73f, 32.0f)
                lineTo(86.27f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 73.0f, 39.12f)
                lineTo(18.69f, 120.53f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.13f, 13.09f)
                lineTo(38.0f, 212.21f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 53.43f, 224.0f)
                lineTo(80.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(96.0f, 192.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(26.57f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 218.0f, 212.21f)
                lineToRelative(21.44f, -78.59f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 237.31f, 120.53f)
                close()
                moveTo(80.0f, 176.0f)
                lineTo(80.0f, 69.0f)
                lineToRelative(24.0f, 14.15f)
                lineTo(104.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(120.0f, 92.57f)
                lineToRelative(3.94f, 2.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.12f, 0.0f)
                lineTo(136.0f, 92.57f)
                lineTo(136.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 83.14f)
                lineTo(176.0f, 69.0f)
                lineTo(176.0f, 176.0f)
                close()
                moveTo(169.73f, 48.0f)
                lineToRelative(2.92f, 4.39f)
                lineTo(128.0f, 78.71f)
                lineTo(83.35f, 52.39f)
                lineTo(86.27f, 48.0f)
                close()
                moveTo(80.0f, 208.0f)
                lineTo(53.43f, 208.0f)
                lineTo(32.0f, 129.41f)
                lineToRelative(32.0f, -48.0f)
                lineTo(64.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                close()
                moveTo(202.57f, 208.0f)
                lineTo(176.0f, 208.0f)
                lineTo(176.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(192.0f, 81.41f)
                lineToRelative(32.0f, 48.0f)
                close()
            }
        }
        .build()
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
