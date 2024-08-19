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

public val ThinGroup.Steamlogo: ImageVector
    get() {
        if (_steamlogo != null) {
            return _steamlogo!!
        }
        _steamlogo = Builder(name = "Steamlogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(115.12f, 182.62f)
                lineToRelative(61.21f, -49.93f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -45.0f, -45.0f)
                lineTo(85.48f, 143.83f)
                lineTo(40.68f, 99.0f)
                arcToRelative(91.6f, 91.6f, 0.0f, true, true, -2.46f, 8.86f)
                lineToRelative(42.23f, 42.23f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 34.67f, 32.51f)
                close()
                moveTo(124.03f, 109.22f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 154.78f, 140.0f)
                lineTo(124.0f, 165.09f)
                curveToRelative(0.0f, -0.36f, 0.0f, -0.72f, 0.0f, -1.09f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                curveToRelative(-0.37f, 0.0f, -0.73f, 0.0f, -1.09f, 0.0f)
                close()
                moveTo(156.0f, 132.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 156.0f, 132.0f)
                close()
                moveTo(100.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 148.0f)
                close()
            }
        }
        .build()
        return _steamlogo!!
    }

private var _steamlogo: ImageVector? = null
