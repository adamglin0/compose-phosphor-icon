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

public val ThinGroup.Radical: ImageVector
    get() {
        if (_radical != null) {
            return _radical!!
        }
        _radical = Builder(name = "Radical", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(84.0f)
                horizontalLineTo(130.77f)
                lineToRelative(-47.0f, 125.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.49f, 0.0f)
                lineToRelative(-48.0f, -128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.49f, -2.81f)
                lineTo(80.0f, 196.61f)
                lineToRelative(44.26f, -118.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 128.0f, 76.0f)
                horizontalLineTo(240.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 80.0f)
                close()
            }
        }
        .build()
        return _radical!!
    }

private var _radical: ImageVector? = null
