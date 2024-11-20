package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) {
            return _currencyEth!!
        }
        _currencyEth = Builder(name = "CurrencyEth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 128.0f)
                lineTo(128.0f, 240.0f)
                lineTo(40.0f, 128.0f)
                lineToRelative(88.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.29f, 123.06f)
                lineToRelative(-88.0f, -112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.58f, 0.0f)
                lineToRelative(-88.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 9.88f)
                lineToRelative(88.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.58f, 0.0f)
                lineToRelative(88.0f, -112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 222.29f, 123.06f)
                close()
                moveTo(136.0f, 39.13f)
                lineToRelative(67.42f, 85.8f)
                lineTo(136.0f, 155.58f)
                close()
                moveTo(120.0f, 155.58f)
                lineTo(52.58f, 124.93f)
                lineTo(120.0f, 39.13f)
                close()
                moveTo(120.0f, 173.15f)
                verticalLineToRelative(43.72f)
                lineToRelative(-53.43f, -68.0f)
                close()
                moveTo(136.0f, 173.15f)
                lineTo(189.43f, 148.86f)
                lineTo(136.0f, 216.86f)
                close()
            }
        }
        .build()
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
