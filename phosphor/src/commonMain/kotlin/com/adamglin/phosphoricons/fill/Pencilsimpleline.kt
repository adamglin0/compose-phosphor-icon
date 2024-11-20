package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.PencilSimpleLine: ImageVector
    get() {
        if (_pencilSimpleLine != null) {
            return _pencilSimpleLine!!
        }
        _pencilSimpleLine = Builder(name = "PencilSimpleLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.32f, 73.37f)
                lineTo(182.63f, 28.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(36.69f, 152.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 32.0f, 163.31f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(115.32f)
                lineToRelative(112.0f, -112.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 227.32f, 73.37f)
                close()
                moveTo(192.0f, 108.69f)
                lineTo(147.32f, 64.0f)
                lineToRelative(24.0f, -24.0f)
                lineTo(216.0f, 84.69f)
                close()
            }
        }
        .build()
        return _pencilSimpleLine!!
    }

private var _pencilSimpleLine: ImageVector? = null
