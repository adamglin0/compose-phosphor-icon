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

public val BoldGroup.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) {
            return _tagChevron!!
        }
        _tagChevron = Builder(name = "TagChevron", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.0f, 121.34f)
                lineTo(204.36f, 52.91f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 187.72f, 44.0f)
                horizontalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 22.0f, 62.66f)
                lineTo(65.58f, 128.0f)
                lineTo(22.0f, 193.34f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 212.0f)
                horizontalLineTo(187.72f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.64f, -8.91f)
                lineTo(250.0f, 134.66f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 250.0f, 121.34f)
                close()
                moveTo(185.58f, 188.0f)
                horizontalLineTo(54.42f)
                lineTo(90.0f, 134.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -13.32f)
                lineTo(54.42f, 68.0f)
                horizontalLineTo(185.58f)
                lineToRelative(40.0f, 60.0f)
                close()
            }
        }
        .build()
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
