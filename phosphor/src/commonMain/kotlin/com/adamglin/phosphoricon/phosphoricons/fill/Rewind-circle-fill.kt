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

public val FillGroup.`Rewind-circle-fill`: ImageVector
    get() {
        if (`_rewind-circle-fill` != null) {
            return `_rewind-circle-fill`!!
        }
        `_rewind-circle-fill` = Builder(name = "Rewind-circle-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(184.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.8f, 6.4f)
                lineToRelative(-48.0f, -36.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 128.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.8f, 6.4f)
                lineToRelative(-48.0f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -12.8f)
                lineToRelative(48.0f, -36.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 92.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.2f, -6.4f)
                lineToRelative(48.0f, -36.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 92.0f)
                close()
            }
        }
        .build()
        return `_rewind-circle-fill`!!
    }

private var `_rewind-circle-fill`: ImageVector? = null
