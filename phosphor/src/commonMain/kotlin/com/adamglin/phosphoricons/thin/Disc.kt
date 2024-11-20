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

public val ThinGroup.Disc: ImageVector
    get() {
        if (_disc != null) {
            return _disc!!
        }
        _disc = Builder(name = "Disc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(163.77f, 124.0f)
                arcToRelative(35.78f, 35.78f, 0.0f, false, false, -7.66f, -18.45f)
                lineToRelative(39.68f, -39.68f)
                arcTo(91.64f, 91.64f, 0.0f, false, true, 219.91f, 124.0f)
                close()
                moveTo(156.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 156.0f, 128.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 190.13f, 60.21f)
                lineTo(150.45f, 99.89f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 163.77f, 132.0f)
                horizontalLineToRelative(56.14f)
                arcTo(92.11f, 92.11f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _disc!!
    }

private var _disc: ImageVector? = null
