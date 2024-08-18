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

public val FillGroup.`Grid-four-fill`: ImageVector
    get() {
        if (`_grid-four-fill` != null) {
            return `_grid-four-fill`!!
        }
        `_grid-four-fill` = Builder(name = "Grid-four-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 56.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(136.0f, 120.0f)
                lineTo(136.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(60.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 56.0f)
                close()
                moveTo(116.0f, 40.0f)
                lineTo(56.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 56.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(76.0f)
                lineTo(120.0f, 44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 116.0f, 40.0f)
                close()
                moveTo(212.0f, 136.0f)
                lineTo(136.0f, 136.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 140.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 212.0f, 136.0f)
                close()
                moveTo(40.0f, 140.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(120.0f, 136.0f)
                lineTo(44.0f, 136.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 140.0f)
                close()
            }
        }
        .build()
        return `_grid-four-fill`!!
    }

private var `_grid-four-fill`: ImageVector? = null
