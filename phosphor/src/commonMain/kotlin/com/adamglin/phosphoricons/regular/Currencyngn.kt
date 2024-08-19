package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Currencyngn: ImageVector
    get() {
        if (_currencyngn != null) {
            return _currencyngn!!
        }
        _currencyngn = Builder(name = "Currencyngn", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 136.0f)
                lineTo(200.0f, 136.0f)
                lineTo(200.0f, 120.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(200.0f, 104.0f)
                lineTo(200.0f, 46.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(58.0f)
                lineTo(119.42f, 104.0f)
                lineTo(70.31f, 41.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 46.0f)
                verticalLineToRelative(58.0f)
                lineTo(40.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(56.0f, 120.0f)
                verticalLineToRelative(16.0f)
                lineTo(40.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(56.0f, 152.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(72.0f, 152.0f)
                horizontalLineToRelative(64.58f)
                lineToRelative(49.11f, 62.92f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 218.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 2.6f, -0.44f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 210.0f)
                lineTo(200.0f, 152.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(184.0f, 120.0f)
                verticalLineToRelative(16.0f)
                lineTo(144.39f, 136.0f)
                lineTo(131.9f, 120.0f)
                close()
                moveTo(72.0f, 69.25f)
                lineTo(99.12f, 104.0f)
                lineTo(72.0f, 104.0f)
                close()
                moveTo(72.0f, 136.0f)
                lineTo(72.0f, 120.0f)
                horizontalLineToRelative(39.61f)
                lineToRelative(12.49f, 16.0f)
                close()
                moveTo(184.0f, 186.75f)
                lineTo(156.88f, 152.0f)
                lineTo(184.0f, 152.0f)
                close()
            }
        }
        .build()
        return _currencyngn!!
    }

private var _currencyngn: ImageVector? = null
