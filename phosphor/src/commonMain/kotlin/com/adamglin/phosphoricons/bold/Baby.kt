package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Baby: ImageVector
    get() {
        if (_baby != null) {
            return _baby!!
        }
        _baby = Builder(name = "Baby", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 92.0f, 144.0f)
                close()
                moveTo(164.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 164.0f, 112.0f)
                close()
                moveTo(149.6f, 161.85f)
                arcToRelative(41.0f, 41.0f, 0.0f, false, true, -43.2f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.8f, 20.3f)
                arcToRelative(65.0f, 65.0f, 0.0f, false, false, 68.8f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.8f, -20.3f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(84.08f, 84.08f, 0.0f, false, false, -82.0f, -83.95f)
                curveToRelative(-9.46f, 14.2f, -10.0f, 27.28f, -10.0f, 28.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f)
                curveToRelative(0.0f, -0.63f, 0.1f, -10.48f, 5.0f, -23.52f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 212.0f, 128.0f)
                close()
            }
        }
        .build()
        return _baby!!
    }

private var _baby: ImageVector? = null
