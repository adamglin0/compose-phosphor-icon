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

public val FillGroup.`Gavel-fill`: ImageVector
    get() {
        if (`_gavel-fill` != null) {
            return `_gavel-fill`!!
        }
        `_gavel-fill` = Builder(name = "Gavel-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.69f, 99.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.63f)
                lineToRelative(64.0f, -64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 22.63f)
                lineToRelative(-64.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, 0.0f)
                close()
                moveTo(243.32f, 116.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineToRelative(-64.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(64.0f, -64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 243.32f, 116.68f)
                close()
                moveTo(208.21f, 100.88f)
                lineTo(155.12f, 47.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineTo(87.8f, 109.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineTo(103.0f, 130.34f)
                lineTo(28.69f, 204.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 22.62f)
                lineTo(125.66f, 153.0f)
                lineToRelative(15.23f, 15.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(61.66f, -61.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.21f, 100.88f)
                close()
            }
        }
        .build()
        return `_gavel-fill`!!
    }

private var `_gavel-fill`: ImageVector? = null
