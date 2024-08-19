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

public val ThinGroup.Broadcast: ImageVector
    get() {
        if (_broadcast != null) {
            return _broadcast!!
        }
        _broadcast = Builder(name = "Broadcast", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 92.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 156.0f)
                close()
                moveTo(204.0f, 128.0f)
                arcToRelative(75.74f, 75.74f, 0.0f, false, true, -19.35f, 50.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, -5.34f)
                arcToRelative(67.92f, 67.92f, 0.0f, false, false, 0.0f, -90.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.0f, -5.34f)
                arcTo(75.74f, 75.74f, 0.0f, false, true, 204.0f, 128.0f)
                close()
                moveTo(65.34f, 101.53f)
                arcToRelative(67.92f, 67.92f, 0.0f, false, false, 12.0f, 71.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, 5.34f)
                arcToRelative(75.93f, 75.93f, 0.0f, false, true, 0.0f, -101.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.0f, 5.34f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 65.34f, 101.53f)
                close()
                moveTo(244.0f, 128.0f)
                arcToRelative(115.68f, 115.68f, 0.0f, false, true, -33.14f, 81.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.72f, -5.6f)
                arcToRelative(107.89f, 107.89f, 0.0f, false, false, 0.0f, -151.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.72f, -5.6f)
                arcTo(115.68f, 115.68f, 0.0f, false, true, 244.0f, 128.0f)
                close()
                moveTo(50.86f, 203.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.72f, 5.6f)
                arcToRelative(115.91f, 115.91f, 0.0f, false, true, 0.0f, -162.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.72f, 5.6f)
                arcToRelative(107.89f, 107.89f, 0.0f, false, false, 0.0f, 151.16f)
                close()
            }
        }
        .build()
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
