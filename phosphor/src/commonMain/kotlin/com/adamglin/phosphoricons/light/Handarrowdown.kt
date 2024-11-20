package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.HandArrowDown: ImageVector
    get() {
        if (_handArrowDown != null) {
            return _handArrowDown!!
        }
        _handArrowDown = Builder(name = "HandArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(155.76f, 76.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(186.0f, 89.51f)
                lineTo(186.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(198.0f, 89.51f)
                lineToRelative(21.76f, -21.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                close()
            }
        }
        .build()
        return _handArrowDown!!
    }

private var _handArrowDown: ImageVector? = null
