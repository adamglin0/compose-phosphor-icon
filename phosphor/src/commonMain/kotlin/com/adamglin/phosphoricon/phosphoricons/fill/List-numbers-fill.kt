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

public val FillGroup.`List-numbers-fill`: ImageVector
    get() {
        if (`_list-numbers-fill` != null) {
            return `_list-numbers-fill`!!
        }
        `_list-numbers-fill` = Builder(name = "List-numbers-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(56.84f, 75.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.58f, -10.74f)
                lineToRelative(16.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 64.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(72.0f, 76.94f)
                lineToRelative(-4.42f, 2.22f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.84f, 75.58f)
                close()
                moveTo(92.0f, 180.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(68.0f, 196.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -12.8f)
                lineToRelative(21.67f, -28.89f)
                arcTo(3.92f, 3.92f, 0.0f, false, false, 84.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.77f, -1.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.09f, -5.34f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 35.0f, 18.53f)
                lineTo(84.0f, 180.0f)
                close()
                moveTo(192.0f, 184.0f)
                lineTo(120.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(192.0f, 136.0f)
                lineTo(120.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(192.0f, 88.0f)
                lineTo(120.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_list-numbers-fill`!!
    }

private var `_list-numbers-fill`: ImageVector? = null
