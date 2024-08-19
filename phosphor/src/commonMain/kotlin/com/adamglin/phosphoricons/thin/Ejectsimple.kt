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

public val ThinGroup.Ejectsimple: ImageVector
    get() {
        if (_ejectsimple != null) {
            return _ejectsimple!!
        }
        _ejectsimple = Builder(name = "Ejectsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(224.0f, 196.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 200.0f)
                close()
                moveTo(29.2f, 149.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 1.51f, -12.83f)
                lineTo(112.37f, 35.46f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 31.26f, 0.0f)
                lineToRelative(81.66f, 100.83f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 215.92f, 156.0f)
                lineTo(40.08f, 156.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 29.2f, 149.12f)
                close()
                moveTo(36.42f, 145.68f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 40.08f, 148.0f)
                lineTo(215.92f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.66f, -2.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.51f, -4.36f)
                lineTo(137.41f, 40.5f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, false, -18.82f, 0.0f)
                lineTo(36.93f, 141.32f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 36.42f, 145.68f)
                close()
            }
        }
        .build()
        return _ejectsimple!!
    }

private var _ejectsimple: ImageVector? = null
