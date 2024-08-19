package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Currencyinr: ImageVector
    get() {
        if (_currencyinr != null) {
            return _currencyinr!!
        }
        _currencyinr = Builder(name = "Currencyinr", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(166.32f, 96.0f)
                lineTo(176.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-8.19f)
                arcTo(44.06f, 44.06f, 0.0f, false, true, 124.0f, 152.0f)
                lineTo(111.32f, 152.0f)
                lineToRelative(53.59f, 41.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -9.82f, 12.62f)
                lineToRelative(-72.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 136.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 27.71f, -24.0f)
                lineTo(88.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(61.29f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 124.0f, 80.0f)
                lineTo(88.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(157.92f, 80.0f)
                arcTo(43.87f, 43.87f, 0.0f, false, true, 166.32f, 96.0f)
                close()
            }
        }
        .build()
        return _currencyinr!!
    }

private var _currencyinr: ImageVector? = null
