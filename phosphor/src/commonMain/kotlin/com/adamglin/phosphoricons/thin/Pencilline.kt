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

public val ThinGroup.Pencilline: ImageVector
    get() {
        if (_pencilline != null) {
            return _pencilline!!
        }
        _pencilline = Builder(name = "Pencilline", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.49f, 76.2f)
                lineTo(179.8f, 31.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(39.51f, 154.83f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 163.31f)
                verticalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(105.66f)
                lineTo(224.49f, 93.17f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.49f, 76.2f)
                close()
                moveTo(73.66f, 188.0f)
                lineTo(164.0f, 97.66f)
                lineTo(186.35f, 120.0f)
                lineTo(96.0f, 210.34f)
                close()
                moveTo(68.0f, 182.34f)
                lineTo(45.66f, 160.0f)
                lineTo(136.0f, 69.66f)
                lineTo(158.35f, 92.0f)
                close()
                moveTo(44.0f, 208.0f)
                verticalLineTo(169.66f)
                lineToRelative(21.17f, 21.17f)
                horizontalLineToRelative(0.0f)
                lineTo(86.34f, 212.0f)
                horizontalLineTo(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 208.0f)
                close()
                moveTo(218.83f, 87.51f)
                lineTo(192.0f, 114.34f)
                lineTo(141.66f, 64.0f)
                lineToRelative(26.83f, -26.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(44.68f, 44.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 218.83f, 87.51f)
                close()
            }
        }
        .build()
        return _pencilline!!
    }

private var _pencilline: ImageVector? = null
