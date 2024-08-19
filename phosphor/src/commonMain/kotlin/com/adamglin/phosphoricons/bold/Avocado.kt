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

public val BoldGroup.Avocado: ImageVector
    get() {
        if (_avocado != null) {
            return _avocado!!
        }
        _avocado = Builder(name = "Avocado", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 108.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 52.0f, 52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 128.0f, 108.0f)
                close()
                moveTo(128.0f, 188.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 188.0f)
                close()
                moveTo(214.76f, 129.32f)
                lineTo(185.0f, 45.17f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 71.42f, 44.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-29.5f, 83.46f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, false, 172.84f, 1.86f)
                close()
                moveTo(128.0f, 228.0f)
                arcToRelative(68.05f, 68.05f, 0.0f, false, true, -63.59f, -92.15f)
                curveToRelative(0.0f, -0.09f, 0.07f, -0.18f, 0.1f, -0.26f)
                lineTo(94.05f, 52.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 68.17f, 0.78f)
                lineToRelative(0.09f, 0.27f)
                lineToRelative(29.82f, 84.28f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 128.0f, 228.0f)
                close()
            }
        }
        .build()
        return _avocado!!
    }

private var _avocado: ImageVector? = null
