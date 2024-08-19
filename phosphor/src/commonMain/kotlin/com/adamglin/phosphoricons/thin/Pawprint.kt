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

public val ThinGroup.Pawprint: ImageVector
    get() {
        if (_pawprint != null) {
            return _pawprint!!
        }
        _pawprint = Builder(name = "Pawprint", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 84.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 212.0f, 84.0f)
                close()
                moveTo(212.0f, 124.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 212.0f, 124.0f)
                close()
                moveTo(68.0f, 108.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 68.0f, 108.0f)
                close()
                moveTo(44.0f, 124.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 44.0f, 124.0f)
                close()
                moveTo(92.0f, 84.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 68.0f, 60.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 92.0f, 84.0f)
                close()
                moveTo(92.0f, 44.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 76.0f, 60.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 92.0f, 44.0f)
                close()
                moveTo(164.0f, 84.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 164.0f, 84.0f)
                close()
                moveTo(164.0f, 44.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 164.0f, 44.0f)
                close()
                moveTo(185.18f, 152.36f)
                arcToRelative(39.32f, 39.32f, 0.0f, false, true, -18.77f, -23.52f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -76.82f, 0.0f)
                arcToRelative(39.3f, 39.3f, 0.0f, false, true, -18.73f, 23.51f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 102.0f, 217.17f)
                arcToRelative(68.14f, 68.14f, 0.0f, false, true, 51.95f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 31.23f, -64.79f)
                close()
                moveTo(168.0f, 212.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, true, -11.0f, -2.23f)
                arcToRelative(76.16f, 76.16f, 0.0f, false, false, -58.11f, 0.0f)
                arcTo(27.72f, 27.72f, 0.0f, false, true, 88.0f, 212.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -13.29f, -52.65f)
                arcToRelative(47.23f, 47.23f, 0.0f, false, false, 22.56f, -28.29f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 61.46f, 0.0f)
                arcToRelative(47.26f, 47.26f, 0.0f, false, false, 22.6f, 28.3f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 168.0f, 212.0f)
                close()
            }
        }
        .build()
        return _pawprint!!
    }

private var _pawprint: ImageVector? = null
