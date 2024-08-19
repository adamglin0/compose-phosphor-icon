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

public val LightGroup.`Hand-coins-light`: ImageVector
    get() {
        if (`_hand-coins-light` != null) {
            return `_hand-coins-light`!!
        }
        `_hand-coins-light` = Builder(name = "Hand-coins-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.12f, 142.65f)
                arcToRelative(22.43f, 22.43f, 0.0f, false, false, -19.55f, -3.88f)
                lineToRelative(-45.24f, 10.4f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 140.0f, 114.0f)
                lineTo(89.94f, 114.0f)
                arcToRelative(29.78f, 29.78f, 0.0f, false, false, -21.21f, 8.79f)
                lineTo(45.52f, 146.0f)
                lineTo(16.0f, 146.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 2.0f, 160.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(120.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.46f, -0.18f)
                lineToRelative(64.0f, -16.0f)
                arcToRelative(7.16f, 7.16f, 0.0f, false, false, 0.89f, -0.3f)
                lineTo(225.17f, 181.0f)
                lineToRelative(0.33f, -0.15f)
                arcToRelative(22.6f, 22.6f, 0.0f, false, false, 3.62f, -38.18f)
                close()
                moveTo(14.0f, 200.0f)
                lineTo(14.0f, 160.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(42.0f, 158.0f)
                verticalLineToRelative(44.0f)
                lineTo(16.0f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 200.0f)
                close()
                moveTo(220.28f, 170.0f)
                lineTo(182.08f, 186.27f)
                lineTo(119.26f, 202.0f)
                lineTo(54.0f, 202.0f)
                lineTo(54.0f, 154.49f)
                lineToRelative(23.21f, -23.22f)
                arcTo(17.88f, 17.88f, 0.0f, false, true, 89.94f, 126.0f)
                lineTo(140.0f, 126.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 28.0f)
                lineTo(112.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.34f, -0.15f)
                lineToRelative(67.0f, -15.41f)
                lineToRelative(0.24f, -0.06f)
                arcTo(10.6f, 10.6f, 0.0f, false, true, 220.28f, 170.0f)
                close()
                moveTo(164.0f, 94.0f)
                arcToRelative(34.54f, 34.54f, 0.0f, false, false, 7.28f, -0.78f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 25.46f, -42.43f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 164.0f, 94.0f)
                close()
                moveTo(226.0f, 84.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 226.0f, 84.0f)
                close()
                moveTo(164.0f, 38.0f)
                arcToRelative(21.94f, 21.94f, 0.0f, false, true, 21.51f, 17.49f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -15.38f, 25.65f)
                arcTo(22.0f, 22.0f, 0.0f, true, true, 164.0f, 38.0f)
                close()
            }
        }
        .build()
        return `_hand-coins-light`!!
    }

private var `_hand-coins-light`: ImageVector? = null
