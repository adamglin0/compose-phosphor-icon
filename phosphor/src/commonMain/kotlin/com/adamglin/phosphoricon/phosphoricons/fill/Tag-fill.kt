package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Tag-fill`: ImageVector
    get() {
        if (`_tag-fill` != null) {
            return `_tag-fill`!!
        }
        `_tag-fill` = Builder(name = "Tag-fill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.31f, 136.0f)
                lineTo(144.0f, 36.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 132.69f, 32.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(92.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 36.69f, 144.0f)
                lineTo(136.0f, 243.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(84.68f, -84.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                close()
                moveTo(84.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 96.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_tag-fill`!!
    }

private var `_tag-fill`: ImageVector? = null
