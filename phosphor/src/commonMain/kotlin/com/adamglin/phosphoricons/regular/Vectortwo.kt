package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) {
            return _vectorTwo!!
        }
        _vectorTwo = Builder(name = "VectorTwo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 197.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(204.69f, 200.0f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(59.31f)
                lineTo(53.66f, 77.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 42.34f, 66.34f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(88.0f, 59.31f)
                verticalLineTo(184.0f)
                horizontalLineTo(204.69f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 229.66f, 197.66f)
                close()
            }
        }
        .build()
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
