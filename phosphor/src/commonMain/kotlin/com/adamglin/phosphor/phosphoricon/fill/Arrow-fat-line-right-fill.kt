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

public val FillGroup.`Arrow-fat-line-right-fill`: ImageVector
    get() {
        if (`_arrow-fat-line-right-fill` != null) {
            return `_arrow-fat-line-right-fill`!!
        }
        `_arrow-fat-line-right-fill` = Builder(name = "Arrow-fat-line-right-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(237.66f, 122.34f)
                lineTo(141.66f, 26.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 32.0f)
                lineTo(128.0f, 72.0f)
                lineTo(72.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(96.0f, -96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 122.34f)
                close()
            }
        }
        .build()
        return `_arrow-fat-line-right-fill`!!
    }

private var `_arrow-fat-line-right-fill`: ImageVector? = null
