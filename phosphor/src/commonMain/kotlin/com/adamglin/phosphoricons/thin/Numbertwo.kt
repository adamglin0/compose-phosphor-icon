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

public val ThinGroup.Numbertwo: ImageVector
    get() {
        if (_numbertwo != null) {
            return _numbertwo!!
        }
        _numbertwo = Builder(name = "Numbertwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -6.4f)
                lineToRelative(71.94f, -95.92f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 99.25f, 66.34f)
                arcTo(36.62f, 36.62f, 0.0f, false, false, 95.0f, 73.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.33f, -3.21f)
                arcToRelative(44.42f, 44.42f, 0.0f, false, true, 5.2f, -8.87f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 70.28f, 53.0f)
                lineTo(96.0f, 204.0f)
                horizontalLineToRelative(72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 208.0f)
                close()
            }
        }
        .build()
        return _numbertwo!!
    }

private var _numbertwo: ImageVector? = null
