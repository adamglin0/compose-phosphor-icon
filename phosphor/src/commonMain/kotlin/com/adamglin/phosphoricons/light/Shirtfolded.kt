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

public val LightGroup.Shirtfolded: ImageVector
    get() {
        if (_shirtfolded != null) {
            return _shirtfolded!!
        }
        _shirtfolded = Builder(name = "Shirtfolded", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 42.0f)
                lineTo(178.48f, 42.0f)
                lineTo(164.25f, 27.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 26.0f)
                lineTo(96.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.25f, 1.76f)
                lineTo(77.52f, 42.0f)
                lineTo(56.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 56.0f)
                lineTo(42.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 42.0f)
                close()
                moveTo(128.0f, 69.18f)
                lineTo(107.21f, 38.0f)
                horizontalLineToRelative(41.58f)
                close()
                moveTo(160.93f, 41.42f)
                lineTo(170.0f, 50.49f)
                lineTo(170.0f, 104.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.25f, 1.56f)
                lineTo(135.93f, 78.92f)
                close()
                moveTo(86.0f, 50.49f)
                lineToRelative(9.07f, -9.07f)
                lineToRelative(25.0f, 37.5f)
                lineTo(89.25f, 105.54f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 86.0f, 104.0f)
                close()
                moveTo(54.0f, 208.0f)
                lineTo(54.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(74.0f, 54.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(13.87f, 13.87f, 0.0f, false, false, 8.06f, 12.68f)
                arcTo(14.11f, 14.11f, 0.0f, false, false, 88.0f, 118.0f)
                arcTo(13.87f, 13.87f, 0.0f, false, false, 97.0f, 114.74f)
                lineToRelative(0.08f, -0.07f)
                lineToRelative(25.0f, -21.56f)
                lineTo(122.08f, 210.0f)
                lineTo(56.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 54.0f, 208.0f)
                close()
                moveTo(202.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(134.0f, 210.0f)
                lineTo(134.0f, 93.11f)
                lineToRelative(25.0f, 21.56f)
                lineToRelative(0.08f, 0.07f)
                arcTo(13.87f, 13.87f, 0.0f, false, false, 168.0f, 118.0f)
                arcToRelative(14.08f, 14.08f, 0.0f, false, false, 6.0f, -1.35f)
                arcTo(13.87f, 13.87f, 0.0f, false, false, 182.0f, 104.0f)
                lineTo(182.0f, 54.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _shirtfolded!!
    }

private var _shirtfolded: ImageVector? = null
