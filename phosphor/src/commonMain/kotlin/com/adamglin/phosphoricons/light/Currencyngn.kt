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

public val LightGroup.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) {
            return _currencyNgn!!
        }
        _currencyNgn = Builder(name = "CurrencyNgn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 138.0f)
                lineTo(198.0f, 138.0f)
                lineTo(198.0f, 118.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(198.0f, 106.0f)
                lineTo(198.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(60.0f)
                lineTo(118.44f, 106.0f)
                lineTo(68.73f, 42.31f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 58.0f, 46.0f)
                verticalLineToRelative(60.0f)
                lineTo(40.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(58.0f, 118.0f)
                verticalLineToRelative(20.0f)
                lineTo(40.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(58.0f, 150.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(70.0f, 150.0f)
                horizontalLineToRelative(67.56f)
                lineToRelative(49.71f, 63.69f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 198.0f, 210.0f)
                lineTo(198.0f, 150.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(186.0f, 118.0f)
                verticalLineToRelative(20.0f)
                lineTo(143.42f, 138.0f)
                lineToRelative(-15.61f, -20.0f)
                close()
                moveTo(70.0f, 63.44f)
                lineTo(103.22f, 106.0f)
                lineTo(70.0f, 106.0f)
                close()
                moveTo(70.0f, 138.0f)
                lineTo(70.0f, 118.0f)
                horizontalLineToRelative(42.58f)
                lineToRelative(15.61f, 20.0f)
                close()
                moveTo(186.0f, 192.56f)
                lineTo(152.78f, 150.0f)
                lineTo(186.0f, 150.0f)
                close()
            }
        }
        .build()
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
