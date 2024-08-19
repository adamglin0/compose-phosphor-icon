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

public val FillGroup.`Caret-double-down-fill`: ImageVector
    get() {
        if (`_caret-double-down-fill` != null) {
            return `_caret-double-down-fill`!!
        }
        `_caret-double-down-fill` = Builder(name = "Caret-double-down-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.39f, 132.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.73f, 8.72f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-80.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 128.0f)
                horizontalLineToRelative(60.69f)
                lineTo(42.34f, 61.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 48.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 13.66f)
                lineTo(147.31f, 128.0f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 215.39f, 132.94f)
                close()
            }
        }
        .build()
        return `_caret-double-down-fill`!!
    }

private var `_caret-double-down-fill`: ImageVector? = null
