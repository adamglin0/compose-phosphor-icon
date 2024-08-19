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

public val BoldGroup.`Box-arrow-down-bold`: ImageVector
    get() {
        if (`_box-arrow-down-bold` != null) {
            return `_box-arrow-down-bold`!!
        }
        `_box-arrow-down-bold` = Builder(name = "Box-arrow-down-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.73f, 66.63f)
                lineToRelative(-16.0f, -32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.73f, 6.63f)
                lineToRelative(-16.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 72.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 226.73f, 66.63f)
                close()
                moveTo(192.58f, 52.0f)
                lineToRelative(6.0f, 12.0f)
                lineTo(57.42f, 64.0f)
                lineToRelative(6.0f, -12.0f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(52.0f, 88.0f)
                lineTo(204.0f, 88.0f)
                lineTo(204.0f, 204.0f)
                close()
                moveTo(168.49f, 139.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(116.0f, 151.0f)
                lineTo(116.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(39.0f)
                lineToRelative(11.51f, -11.52f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.49f, 139.51f)
                close()
            }
        }
        .build()
        return `_box-arrow-down-bold`!!
    }

private var `_box-arrow-down-bold`: ImageVector? = null
