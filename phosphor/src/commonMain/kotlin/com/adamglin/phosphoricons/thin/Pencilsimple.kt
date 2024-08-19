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

public val ThinGroup.Pencilsimple: ImageVector
    get() {
        if (_pencilsimple != null) {
            return _pencilsimple!!
        }
        _pencilsimple = Builder(name = "Pencilsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.49f, 76.2f)
                lineTo(179.8f, 31.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(133.17f, 61.17f)
                horizontalLineToRelative(0.0f)
                lineTo(39.52f, 154.83f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 36.0f, 163.31f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(92.69f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.48f, -3.51f)
                lineTo(224.48f, 93.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(95.49f, 210.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.69f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 163.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -2.83f)
                lineTo(136.0f, 69.65f)
                lineTo(186.34f, 120.0f)
                close()
                moveTo(218.83f, 87.51f)
                lineTo(192.0f, 114.34f)
                lineTo(141.66f, 64.0f)
                lineToRelative(26.82f, -26.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(44.69f, 44.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                close()
            }
        }
        .build()
        return _pencilsimple!!
    }

private var _pencilsimple: ImageVector? = null
