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

public val FillGroup.`Rewind-fill`: ImageVector
    get() {
        if (`_rewind-fill` != null) {
            return `_rewind-fill`!!
        }
        `_rewind-fill` = Builder(name = "Rewind-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 71.84f)
                verticalLineTo(184.16f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, true, -24.48f, 13.34f)
                lineTo(128.0f, 146.86f)
                verticalLineToRelative(37.3f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, true, -24.48f, 13.34f)
                lineTo(15.33f, 141.34f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, 0.0f, -26.68f)
                lineTo(103.52f, 58.5f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 128.0f, 71.84f)
                verticalLineToRelative(37.3f)
                lineTo(207.52f, 58.5f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 232.0f, 71.84f)
                close()
            }
        }
        .build()
        return `_rewind-fill`!!
    }

private var `_rewind-fill`: ImageVector? = null
