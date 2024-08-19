package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Grid-nine-light`: ImageVector
    get() {
        if (`_grid-nine-light` != null) {
            return `_grid-nine-light`!!
        }
        `_grid-nine-light` = Builder(name = "Grid-nine-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 50.0f)
                lineTo(40.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 64.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 50.0f)
                close()
                moveTo(102.0f, 146.0f)
                lineTo(102.0f, 110.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(36.0f)
                close()
                moveTo(154.0f, 158.0f)
                verticalLineToRelative(36.0f)
                lineTo(102.0f, 194.0f)
                lineTo(102.0f, 158.0f)
                close()
                moveTo(38.0f, 110.0f)
                lineTo(90.0f, 110.0f)
                verticalLineToRelative(36.0f)
                lineTo(38.0f, 146.0f)
                close()
                moveTo(102.0f, 98.0f)
                lineTo(102.0f, 62.0f)
                horizontalLineToRelative(52.0f)
                lineTo(154.0f, 98.0f)
                close()
                moveTo(166.0f, 110.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(36.0f)
                lineTo(166.0f, 146.0f)
                close()
                moveTo(218.0f, 64.0f)
                lineTo(218.0f, 98.0f)
                lineTo(166.0f, 98.0f)
                lineTo(166.0f, 62.0f)
                horizontalLineToRelative(50.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 218.0f, 64.0f)
                close()
                moveTo(40.0f, 62.0f)
                lineTo(90.0f, 62.0f)
                lineTo(90.0f, 98.0f)
                lineTo(38.0f, 98.0f)
                lineTo(38.0f, 64.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 62.0f)
                close()
                moveTo(38.0f, 192.0f)
                lineTo(38.0f, 158.0f)
                lineTo(90.0f, 158.0f)
                verticalLineToRelative(36.0f)
                lineTo(40.0f, 194.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 192.0f)
                close()
                moveTo(216.0f, 194.0f)
                lineTo(166.0f, 194.0f)
                lineTo(166.0f, 158.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(34.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 194.0f)
                close()
            }
        }
        .build()
        return `_grid-nine-light`!!
    }

private var `_grid-nine-light`: ImageVector? = null
