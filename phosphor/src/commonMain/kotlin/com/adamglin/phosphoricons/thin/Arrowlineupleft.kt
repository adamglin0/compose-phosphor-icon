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

public val ThinGroup.Arrowlineupleft: ImageVector
    get() {
        if (_arrowlineupleft != null) {
            return _arrowlineupleft!!
        }
        _arrowlineupleft = Builder(name = "Arrowlineupleft", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(224.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 208.0f)
                close()
                moveTo(72.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(57.66f)
                lineTo(181.17f, 162.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineTo(81.66f, 52.0f)
                horizontalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 72.0f, 148.0f)
                close()
            }
        }
        .build()
        return _arrowlineupleft!!
    }

private var _arrowlineupleft: ImageVector? = null
