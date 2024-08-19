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

public val BoldGroup.`Gas-can-bold`: ImageVector
    get() {
        if (`_gas-can-bold` != null) {
            return `_gas-can-bold`!!
        }
        `_gas-can-bold` = Builder(name = "Gas-can-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 20.0f)
                lineTo(131.31f, 20.0f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, -14.14f, 5.86f)
                lineTo(105.66f, 37.37f)
                lineTo(90.14f, 21.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.28f)
                lineTo(53.37f, 89.66f)
                lineTo(41.86f, 101.17f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 36.0f, 115.31f)
                lineTo(36.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 20.0f)
                close()
                moveTo(57.66f, 60.0f)
                lineTo(76.0f, 41.66f)
                lineTo(88.69f, 54.34f)
                lineTo(70.34f, 72.69f)
                close()
                moveTo(196.0f, 212.0f)
                lineTo(60.0f, 212.0f)
                lineTo(60.0f, 117.0f)
                lineTo(78.83f, 98.14f)
                horizontalLineToRelative(0.0f)
                lineTo(133.0f, 44.0f)
                horizontalLineToRelative(63.0f)
                close()
                moveTo(136.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(148.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 136.0f, 68.0f)
                close()
                moveTo(175.5f, 133.37f)
                lineTo(147.21f, 156.0f)
                lineToRelative(28.29f, 22.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.0f, 18.74f)
                lineToRelative(-32.5f, -26.0f)
                lineToRelative(-32.5f, 26.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.0f, -18.74f)
                lineTo(108.79f, 156.0f)
                lineTo(80.5f, 133.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.0f, -18.74f)
                lineToRelative(32.5f, 26.0f)
                lineToRelative(32.5f, -26.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.0f, 18.74f)
                close()
            }
        }
        .build()
        return `_gas-can-bold`!!
    }

private var `_gas-can-bold`: ImageVector? = null
