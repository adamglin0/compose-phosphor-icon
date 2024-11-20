package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.SubsetProperOf: ImageVector
    get() {
        if (_subsetProperOf != null) {
            return _subsetProperOf!!
        }
        _subsetProperOf = Builder(name = "SubsetProperOf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 48.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(128.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, -80.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 80.0f, -80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 0.0f, -176.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(128.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, 144.0f)
                horizontalLineToRelative(72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 208.0f)
                close()
            }
        }
        .build()
        return _subsetProperOf!!
    }

private var _subsetProperOf: ImageVector? = null
