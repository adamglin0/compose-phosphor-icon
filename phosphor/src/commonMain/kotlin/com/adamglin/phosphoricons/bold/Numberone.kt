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

public val BoldGroup.NumberOne: ImageVector
    get() {
        if (_numberOne != null) {
            return _numberOne!!
        }
        _numberOne = Builder(name = "NumberOne", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(69.19f)
                lineToRelative(-21.83f, 13.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 89.83f, 61.71f)
                lineToRelative(40.0f, -24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 148.0f, 48.0f)
                close()
            }
        }
        .build()
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
