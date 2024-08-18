package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Tag-chevron-fill`: ImageVector
    get() {
        if (`_tag-chevron-fill` != null) {
            return `_tag-chevron-fill`!!
        }
        `_tag-chevron-fill` = Builder(name = "Tag-chevron-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.66f, 132.44f)
                lineTo(201.0f, 200.88f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 187.72f, 208.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.66f, -12.44f)
                lineTo(70.39f, 128.0f)
                lineToRelative(-45.0f, -67.56f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 48.0f)
                horizontalLineTo(187.72f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 201.0f, 55.12f)
                lineToRelative(45.63f, 68.44f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 246.66f, 132.44f)
                close()
            }
        }
        .build()
        return `_tag-chevron-fill`!!
    }

private var `_tag-chevron-fill`: ImageVector? = null
