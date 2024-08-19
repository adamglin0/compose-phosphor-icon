package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Pencilsimple: ImageVector
    get() {
        if (_pencilsimple != null) {
            return _pencilsimple!!
        }
        _pencilsimple = Builder(name = "Pencilsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.14f, 70.54f)
                lineTo(185.46f, 25.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.29f, 0.0f)
                lineTo(33.86f, 149.17f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 28.0f, 163.31f)
                verticalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(92.69f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f)
                lineTo(230.14f, 98.82f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.28f)
                close()
                moveTo(91.0f, 204.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(165.0f)
                lineToRelative(84.0f, -84.0f)
                lineToRelative(39.0f, 39.0f)
                close()
                moveTo(192.0f, 103.0f)
                lineTo(153.0f, 64.0f)
                lineToRelative(18.34f, -18.34f)
                lineToRelative(39.0f, 39.0f)
                close()
            }
        }
        .build()
        return _pencilsimple!!
    }

private var _pencilsimple: ImageVector? = null
