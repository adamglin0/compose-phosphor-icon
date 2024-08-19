package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Paragraph-light`: ImageVector
    get() {
        if (`_paragraph-light` != null) {
            return `_paragraph-light`!!
        }
        `_paragraph-light` = Builder(name = "Paragraph-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 42.0f)
                horizontalLineTo(96.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 0.0f, 124.0f)
                horizontalLineToRelative(42.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(54.0f)
                horizontalLineToRelative(28.0f)
                verticalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(54.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(138.0f, 154.0f)
                horizontalLineTo(96.0f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 96.0f, 54.0f)
                horizontalLineToRelative(42.0f)
                close()
            }
        }
        .build()
        return `_paragraph-light`!!
    }

private var `_paragraph-light`: ImageVector? = null
