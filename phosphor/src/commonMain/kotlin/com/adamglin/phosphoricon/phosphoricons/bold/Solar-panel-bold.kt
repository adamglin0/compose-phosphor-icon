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

public val BoldGroup.`Solar-panel-bold`: ImageVector
    get() {
        if (`_solar-panel-bold` != null) {
            return `_solar-panel-bold`!!
        }
        `_solar-panel-bold` = Builder(name = "Solar-panel-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 100.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 44.0f, 88.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(44.0f, 112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 100.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(140.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 36.0f)
                close()
                moveTo(65.77f, 54.74f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, -17.0f)
                lineToRelative(-5.66f, -5.65f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                close()
                moveTo(181.77f, 58.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.52f)
                lineToRelative(5.65f, -5.65f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineToRelative(-5.66f, 5.65f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, 20.49f)
                close()
                moveTo(192.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 100.0f)
                close()
                moveTo(88.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -104.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 112.0f)
                close()
                moveTo(242.36f, 222.05f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.0f, 228.0f)
                lineTo(24.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.45f, -17.9f)
                lineToRelative(43.0f, -76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 67.0f, 128.0f)
                lineTo(189.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.45f, 6.1f)
                lineToRelative(43.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 242.36f, 222.05f)
                close()
                moveTo(182.0f, 152.0f)
                lineTo(140.0f, 152.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(48.82f)
                close()
                moveTo(74.0f, 152.0f)
                lineToRelative(-6.78f, 12.0f)
                lineTo(116.0f, 164.0f)
                lineTo(116.0f, 152.0f)
                close()
                moveTo(44.57f, 204.0f)
                lineTo(116.0f, 204.0f)
                lineTo(116.0f, 188.0f)
                lineTo(53.61f, 188.0f)
                close()
                moveTo(211.43f, 204.0f)
                lineTo(202.43f, 188.0f)
                lineTo(140.0f, 188.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return `_solar-panel-bold`!!
    }

private var `_solar-panel-bold`: ImageVector? = null
