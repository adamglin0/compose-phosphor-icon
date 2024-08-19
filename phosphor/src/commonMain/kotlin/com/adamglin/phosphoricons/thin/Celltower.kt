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

public val ThinGroup.Celltower: ImageVector
    get() {
        if (_celltower != null) {
            return _celltower!!
        }
        _celltower = Builder(name = "Celltower", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(131.58f, 86.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.16f, 0.0f)
                lineToRelative(-72.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.16f, 3.58f)
                lineTo(74.47f, 204.0f)
                horizontalLineTo(181.53f)
                lineToRelative(14.89f, 29.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 200.0f, 236.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 1.79f, -0.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.79f, -5.37f)
                close()
                moveTo(128.0f, 96.94f)
                lineTo(161.53f, 164.0f)
                horizontalLineTo(94.47f)
                close()
                moveTo(78.47f, 196.0f)
                lineToRelative(12.0f, -24.0f)
                horizontalLineToRelative(75.06f)
                lineToRelative(12.0f, 24.0f)
                close()
                moveTo(163.42f, 94.45f)
                arcTo(35.57f, 35.57f, 0.0f, false, false, 164.0f, 88.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                arcToRelative(35.57f, 35.57f, 0.0f, false, false, 0.58f, 6.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.88f, 1.43f)
                arcTo(45.18f, 45.18f, 0.0f, false, true, 84.0f, 88.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 88.0f, 0.0f)
                arcToRelative(45.18f, 45.18f, 0.0f, false, true, -0.7f, 7.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, 3.29f)
                arcToRelative(4.38f, 4.38f, 0.0f, false, true, -0.71f, -0.07f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 163.42f, 94.45f)
                close()
                moveTo(67.34f, 133.79f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 121.32f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.38f, -4.82f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -108.56f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.38f, 4.82f)
                close()
            }
        }
        .build()
        return _celltower!!
    }

private var _celltower: ImageVector? = null
