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

public val LightGroup.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) {
            return _boxingGlove!!
        }
        _boxingGlove = Builder(name = "BoxingGlove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 18.0f)
                lineTo(120.0f, 18.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 66.0f, 72.0f)
                verticalLineToRelative(2.0f)
                lineTo(56.0f, 74.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -30.0f, 30.0f)
                verticalLineToRelative(29.19f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 3.07f, 8.75f)
                arcToRelative(5.66f, 5.66f, 0.0f, false, false, 0.47f, 0.52f)
                lineToRelative(36.46f, 36.0f)
                lineTo(66.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(192.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(206.0f, 176.84f)
                lineToRelative(15.46f, -54.11f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, false, 0.54f, -3.85f)
                lineTo(222.0f, 72.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 168.0f, 18.0f)
                close()
                moveTo(210.0f, 118.88f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.08f, 0.55f)
                lineToRelative(-15.69f, 54.92f)
                arcTo(6.14f, 6.14f, 0.0f, false, false, 194.0f, 176.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(80.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(78.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.78f, -4.27f)
                lineTo(38.3f, 134.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.3f, -1.06f)
                lineTo(38.0f, 104.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 56.0f, 86.0f)
                lineTo(66.0f, 86.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(78.0f, 72.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, -42.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, 42.0f)
                close()
                moveTo(170.68f, 165.37f)
                lineTo(149.42f, 176.0f)
                lineToRelative(21.26f, 10.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.36f, 10.74f)
                lineTo(136.0f, 182.71f)
                lineToRelative(-29.32f, 14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.36f, -10.74f)
                lineTo(122.58f, 176.0f)
                lineToRelative(-21.26f, -10.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.36f, -10.74f)
                lineTo(136.0f, 169.29f)
                lineToRelative(29.32f, -14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 5.36f, 10.74f)
                close()
            }
        }
        .build()
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
