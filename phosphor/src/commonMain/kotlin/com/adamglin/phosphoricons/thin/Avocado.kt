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

public val ThinGroup.Avocado: ImageVector
    get() {
        if (_avocado != null) {
            return _avocado!!
        }
        _avocado = Builder(name = "Avocado", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 116.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 116.0f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 196.0f)
                close()
                moveTo(207.22f, 132.0f)
                lineTo(177.43f, 47.8f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 79.0f, 46.66f)
                horizontalLineToRelative(0.0f)
                lineTo(49.45f, 130.17f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 207.22f, 132.0f)
                close()
                moveTo(128.0f, 236.0f)
                arcTo(76.06f, 76.06f, 0.0f, false, true, 57.0f, 132.92f)
                lineTo(86.5f, 49.33f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 83.35f, 1.05f)
                lineToRelative(29.82f, 84.28f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 128.0f, 236.0f)
                close()
            }
        }
        .build()
        return _avocado!!
    }

private var _avocado: ImageVector? = null
