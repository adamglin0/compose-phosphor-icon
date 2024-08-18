package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Caret-circle-double-right`: ImageVector
    get() {
        if (`_caret-circle-double-right` != null) {
            return `_caret-circle-double-right`!!
        }
        `_caret-circle-double-right` = Builder(name = "Caret-circle-double-right", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.54f, 54.46f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 201.54f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 201.54f, 54.46f)
                close()
                moveTo(190.23f, 190.23f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 0.0f, -124.46f)
                arcTo(88.11f, 88.11f, 0.0f, false, true, 190.23f, 190.23f)
                close()
                moveTo(125.66f, 122.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(108.69f, 128.0f)
                lineTo(82.34f, 101.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 93.66f, 90.34f)
                close()
                moveTo(181.66f, 122.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(164.69f, 128.0f)
                lineToRelative(-26.35f, -26.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                close()
            }
        }
        .build()
        return `_caret-circle-double-right`!!
    }

private var `_caret-circle-double-right`: ImageVector? = null
