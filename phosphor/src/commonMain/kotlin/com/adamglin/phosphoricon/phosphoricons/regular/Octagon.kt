package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = Builder(name = "Octagon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.31f, 80.24f)
                lineTo(175.76f, 28.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 164.45f, 24.0f)
                horizontalLineTo(91.55f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, -11.31f, 4.69f)
                lineTo(28.69f, 80.24f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 24.0f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, 4.69f, 11.31f)
                lineToRelative(51.55f, 51.55f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 91.55f, 232.0f)
                horizontalLineToRelative(72.9f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, 11.31f, -4.69f)
                lineToRelative(51.55f, -51.55f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 232.0f, 164.45f)
                verticalLineTo(91.55f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 227.31f, 80.24f)
                close()
                moveTo(216.0f, 164.45f)
                lineTo(164.45f, 216.0f)
                horizontalLineTo(91.55f)
                lineTo(40.0f, 164.45f)
                verticalLineTo(91.55f)
                lineTo(91.55f, 40.0f)
                horizontalLineToRelative(72.9f)
                lineTo(216.0f, 91.55f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: ImageVector? = null
