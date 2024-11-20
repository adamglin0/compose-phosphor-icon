package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) {
            return _currencyEth!!
        }
        _currencyEth = Builder(name = "CurrencyEth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.15f, 125.53f)
                lineToRelative(-88.0f, -112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.3f, 0.0f)
                lineToRelative(-88.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 4.94f)
                lineToRelative(88.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.3f, 0.0f)
                lineToRelative(88.0f, -112.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 219.15f, 125.53f)
                close()
                moveTo(132.0f, 27.57f)
                lineToRelative(77.71f, 98.9f)
                lineTo(132.0f, 161.79f)
                close()
                moveTo(124.0f, 161.79f)
                lineTo(46.29f, 126.47f)
                lineTo(124.0f, 27.57f)
                close()
                moveTo(124.0f, 170.58f)
                verticalLineToRelative(57.85f)
                lineToRelative(-70.72f, -90.0f)
                close()
                moveTo(132.0f, 170.58f)
                lineTo(202.72f, 138.43f)
                lineTo(132.0f, 228.43f)
                close()
            }
        }
        .build()
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
