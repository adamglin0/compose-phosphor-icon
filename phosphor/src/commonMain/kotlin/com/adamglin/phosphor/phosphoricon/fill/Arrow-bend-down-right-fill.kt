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

public val FillGroup.`Arrow-bend-down-right-fill`: ImageVector
    get() {
        if (`_arrow-bend-down-right-fill` != null) {
            return `_arrow-bend-down-right-fill`!!
        }
        `_arrow-bend-down-right-fill` = Builder(name = "Arrow-bend-down-right-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 157.66f)
                lineToRelative(-48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 200.0f)
                verticalLineTo(160.0f)
                horizontalLineTo(128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 24.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, 88.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineToRelative(48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 229.66f, 157.66f)
                close()
            }
        }
        .build()
        return `_arrow-bend-down-right-fill`!!
    }

private var `_arrow-bend-down-right-fill`: ImageVector? = null
