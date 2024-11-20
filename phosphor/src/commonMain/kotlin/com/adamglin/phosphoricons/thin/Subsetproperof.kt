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

public val ThinGroup.SubsetProperOf: ImageVector
    get() {
        if (_subsetProperOf != null) {
            return _subsetProperOf!!
        }
        _subsetProperOf = Builder(name = "SubsetProperOf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 0.0f, -168.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(128.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, 152.0f)
                horizontalLineToRelative(72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 208.0f)
                close()
            }
        }
        .build()
        return _subsetProperOf!!
    }

private var _subsetProperOf: ImageVector? = null
