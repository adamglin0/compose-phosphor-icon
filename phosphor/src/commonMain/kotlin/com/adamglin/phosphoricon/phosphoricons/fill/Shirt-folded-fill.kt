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

public val FillGroup.`Shirt-folded-fill`: ImageVector
    get() {
        if (`_shirt-folded-fill` != null) {
            return `_shirt-folded-fill`!!
        }
        `_shirt-folded-fill` = Builder(name = "Shirt-folded-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.0f, 40.0f)
                lineTo(179.35f, 40.0f)
                lineTo(165.66f, 26.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 24.0f)
                lineTo(96.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f)
                lineTo(76.65f, 40.0f)
                lineTo(55.0f, 40.0f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 40.0f, 55.0f)
                lineTo(40.0f, 209.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 15.0f, 15.0f)
                horizontalLineToRelative(61.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(120.0f, 104.27f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 127.47f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                lineTo(136.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(61.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 15.0f, -15.0f)
                lineTo(216.0f, 55.0f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 201.0f, 40.0f)
                close()
                moveTo(86.54f, 107.08f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 104.0f)
                lineTo(80.0f, 59.31f)
                lineTo(95.24f, 44.07f)
                lineToRelative(23.47f, 35.21f)
                close()
                moveTo(128.0f, 80.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(176.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.3f, 3.63f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, -4.21f, -0.51f)
                lineToRelative(-32.2f, -27.82f)
                lineToRelative(23.47f, -35.21f)
                lineTo(176.0f, 59.31f)
                close()
            }
        }
        .build()
        return `_shirt-folded-fill`!!
    }

private var `_shirt-folded-fill`: ImageVector? = null
