package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) {
            return _tagChevron!!
        }
        _tagChevron = Builder(name = "TagChevron", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.66f, 123.56f)
                lineTo(201.0f, 55.12f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 187.72f, 48.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.66f, 12.44f)
                lineTo(70.39f, 128.0f)
                lineToRelative(-45.0f, 67.56f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 208.0f)
                horizontalLineTo(187.72f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 201.0f, 200.88f)
                lineToRelative(45.63f, -68.44f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 246.66f, 123.56f)
                close()
                moveTo(187.72f, 192.0f)
                horizontalLineTo(47.0f)
                lineToRelative(39.71f, -59.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -8.88f)
                lineTo(47.0f, 64.0f)
                horizontalLineTo(187.72f)
                lineToRelative(42.67f, 64.0f)
                close()
            }
        }
        .build()
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
