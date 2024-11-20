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

public val BoldGroup.SubsetProperOf: ImageVector
    get() {
        if (_subsetProperOf != null) {
            return _subsetProperOf!!
        }
        _subsetProperOf = Builder(name = "SubsetProperOf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 0.0f, -184.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(128.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 0.0f, 136.0f)
                horizontalLineToRelative(72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 212.0f, 208.0f)
                close()
            }
        }
        .build()
        return _subsetProperOf!!
    }

private var _subsetProperOf: ImageVector? = null
