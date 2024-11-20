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

public val BoldGroup.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = Builder(name = "Octagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.14f, 77.41f)
                lineTo(178.59f, 25.86f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 164.45f, 20.0f)
                horizontalLineTo(91.55f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, false, -14.14f, 5.86f)
                lineTo(25.86f, 77.41f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 20.0f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, false, 5.86f, 14.14f)
                lineToRelative(51.55f, 51.55f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 91.55f, 236.0f)
                horizontalLineToRelative(72.9f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, false, 14.14f, -5.86f)
                lineToRelative(51.55f, -51.55f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 236.0f, 164.45f)
                verticalLineTo(91.55f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 230.14f, 77.41f)
                close()
                moveTo(212.0f, 162.79f)
                lineTo(162.79f, 212.0f)
                horizontalLineTo(93.21f)
                lineTo(44.0f, 162.79f)
                verticalLineTo(93.21f)
                lineTo(93.21f, 44.0f)
                horizontalLineToRelative(69.58f)
                lineTo(212.0f, 93.21f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: ImageVector? = null
