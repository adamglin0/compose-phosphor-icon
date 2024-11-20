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

public val FillGroup.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = Builder(name = "Octagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.31f, 80.23f)
                lineTo(175.77f, 28.69f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 164.45f, 24.0f)
                horizontalLineTo(91.55f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, false, -11.32f, 4.69f)
                lineTo(28.69f, 80.23f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 24.0f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, false, 4.69f, 11.32f)
                lineToRelative(51.54f, 51.54f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 91.55f, 232.0f)
                horizontalLineToRelative(72.9f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, false, 11.32f, -4.69f)
                lineToRelative(51.54f, -51.54f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 232.0f, 164.45f)
                verticalLineTo(91.55f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 227.31f, 80.23f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: ImageVector? = null
