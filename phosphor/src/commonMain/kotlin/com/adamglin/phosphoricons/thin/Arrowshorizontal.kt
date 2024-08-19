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

public val ThinGroup.Arrowshorizontal: ImageVector
    get() {
        if (_arrowshorizontal != null) {
            return _arrowshorizontal!!
        }
        _arrowshorizontal = Builder(name = "Arrowshorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.83f, 130.83f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(222.34f, 132.0f)
                horizontalLineTo(33.66f)
                lineToRelative(25.17f, 25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                lineTo(33.66f, 124.0f)
                horizontalLineTo(222.34f)
                lineTo(197.17f, 98.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineToRelative(32.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 234.83f, 130.83f)
                close()
            }
        }
        .build()
        return _arrowshorizontal!!
    }

private var _arrowshorizontal: ImageVector? = null
