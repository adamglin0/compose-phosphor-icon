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

public val ThinGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(174.21f, 76.42f)
                lineToRelative(-64.0f, 32.0f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, false, -1.79f, 1.79f)
                lineToRelative(-32.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 80.0f, 180.0f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, 1.79f, -0.42f)
                lineToRelative(64.0f, -32.0f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, false, 1.79f, -1.79f)
                lineToRelative(32.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.37f, -5.37f)
                close()
                moveTo(141.0f, 141.0f)
                lineToRelative(-52.08f, 26.0f)
                lineTo(115.0f, 115.0f)
                lineToRelative(52.08f, -26.0f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
