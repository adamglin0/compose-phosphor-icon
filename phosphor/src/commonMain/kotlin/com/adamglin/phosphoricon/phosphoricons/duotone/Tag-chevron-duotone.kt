package com.adamglin.phosphoricon.phosphoricons.duotone

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
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Tag-chevron-duotone`: ImageVector
    get() {
        if (`_tag-chevron-duotone` != null) {
            return `_tag-chevron-duotone`!!
        }
        `_tag-chevron-duotone` = Builder(name = "Tag-chevron-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                lineToRelative(-45.62f, 68.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.66f, 3.56f)
                horizontalLineTo(32.0f)
                lineToRelative(48.0f, -72.0f)
                lineTo(32.0f, 56.0f)
                horizontalLineTo(187.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.66f, 3.56f)
                close()
            }
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
        return `_tag-chevron-duotone`!!
    }

private var `_tag-chevron-duotone`: ImageVector? = null
