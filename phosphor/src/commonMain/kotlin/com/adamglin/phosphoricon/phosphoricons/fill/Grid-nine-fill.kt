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

public val FillGroup.`Grid-nine-fill`: ImageVector
    get() {
        if (`_grid-nine-fill` != null) {
            return `_grid-nine-fill`!!
        }
        `_grid-nine-fill` = Builder(name = "Grid-nine-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 52.0f)
                lineTo(84.0f, 92.0f)
                lineTo(28.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(24.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 48.0f)
                lineTo(80.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 84.0f, 52.0f)
                close()
                moveTo(100.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(156.0f, 164.0f)
                lineTo(100.0f, 164.0f)
                close()
                moveTo(24.0f, 168.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(80.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(84.0f, 164.0f)
                lineTo(28.0f, 164.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 168.0f)
                close()
                moveTo(24.0f, 112.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(84.0f, 148.0f)
                lineTo(84.0f, 108.0f)
                lineTo(28.0f, 108.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 112.0f)
                close()
                moveTo(152.0f, 48.0f)
                lineTo(104.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(100.0f, 92.0f)
                horizontalLineToRelative(56.0f)
                lineTo(156.0f, 52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 48.0f)
                close()
                moveTo(228.0f, 108.0f)
                lineTo(172.0f, 108.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(232.0f, 112.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 228.0f, 108.0f)
                close()
                moveTo(100.0f, 148.0f)
                horizontalLineToRelative(56.0f)
                lineTo(156.0f, 108.0f)
                lineTo(100.0f, 108.0f)
                close()
                moveTo(216.0f, 48.0f)
                lineTo(176.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(172.0f, 92.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(232.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 48.0f)
                close()
                moveTo(228.0f, 164.0f)
                lineTo(172.0f, 164.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 168.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 228.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_grid-nine-fill`!!
    }

private var `_grid-nine-fill`: ImageVector? = null
