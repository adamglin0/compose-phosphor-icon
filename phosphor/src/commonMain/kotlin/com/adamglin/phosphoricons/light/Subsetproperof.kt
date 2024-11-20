package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.SubsetProperOf: ImageVector
    get() {
        if (_subsetProperOf != null) {
            return _subsetProperOf!!
        }
        _subsetProperOf = Builder(name = "SubsetProperOf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(128.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, 0.0f, -172.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(128.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 0.0f, 148.0f)
                horizontalLineToRelative(72.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 208.0f)
                close()
            }
        }
        .build()
        return _subsetProperOf!!
    }

private var _subsetProperOf: ImageVector? = null
