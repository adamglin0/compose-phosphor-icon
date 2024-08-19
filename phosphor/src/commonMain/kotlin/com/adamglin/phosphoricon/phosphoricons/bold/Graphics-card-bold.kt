package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Graphics-card-bold`: ImageVector
    get() {
        if (`_graphics-card-bold` != null) {
            return `_graphics-card-bold`!!
        }
        `_graphics-card-bold` = Builder(name = "Graphics-card-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 44.0f)
                lineTo(16.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 4.0f, 56.0f)
                lineTo(4.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(28.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(68.0f, 196.0f)
                lineTo(84.0f, 196.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(108.0f, 196.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(148.0f, 196.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(252.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 232.0f, 44.0f)
                close()
                moveTo(228.0f, 172.0f)
                lineTo(28.0f, 172.0f)
                lineTo(28.0f, 68.0f)
                lineTo(228.0f, 68.0f)
                close()
                moveTo(176.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 176.0f, 160.0f)
                close()
                moveTo(176.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 104.0f)
                close()
                moveTo(80.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 80.0f, 160.0f)
                close()
                moveTo(80.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_graphics-card-bold`!!
    }

private var `_graphics-card-bold`: ImageVector? = null
