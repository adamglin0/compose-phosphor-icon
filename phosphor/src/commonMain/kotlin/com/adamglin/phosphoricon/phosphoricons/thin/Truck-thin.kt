package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Truck-thin`: ImageVector
    get() {
        if (`_truck-thin` != null) {
            return `_truck-thin`!!
        }
        `_truck-thin` = Builder(name = "Truck-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.71f, 118.52f)
                lineToRelative(-14.0f, -35.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 226.58f, 76.0f)
                lineTo(188.0f, 76.0f)
                lineTo(188.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(32.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 72.0f)
                lineTo(20.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(52.29f, 196.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.42f, 0.0f)
                horizontalLineToRelative(56.58f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.42f, 0.0f)
                lineTo(240.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(252.0f, 120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 251.71f, 118.52f)
                close()
                moveTo(188.0f, 84.0f)
                horizontalLineToRelative(38.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.72f, 2.51f)
                lineTo(242.09f, 116.0f)
                lineTo(188.0f, 116.0f)
                close()
                moveTo(28.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(180.0f, 68.0f)
                verticalLineToRelative(72.0f)
                lineTo(28.0f, 140.0f)
                close()
                moveTo(80.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 212.0f)
                close()
                moveTo(164.29f, 188.0f)
                lineTo(107.71f, 188.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -55.42f, 0.0f)
                lineTo(32.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 148.0f)
                lineTo(180.0f, 148.0f)
                verticalLineToRelative(18.71f)
                arcTo(28.05f, 28.05f, 0.0f, false, false, 164.29f, 188.0f)
                close()
                moveTo(192.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 192.0f, 212.0f)
                close()
                moveTo(244.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(219.71f, 188.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 188.0f, 164.29f)
                lineTo(188.0f, 124.0f)
                horizontalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return `_truck-thin`!!
    }

private var `_truck-thin`: ImageVector? = null
