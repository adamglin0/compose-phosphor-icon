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

public val FillGroup.Currencykrw: ImageVector
    get() {
        if (_currencykrw != null) {
            return _currencykrw!!
        }
        _currencykrw = Builder(name = "Currencykrw", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(200.0f, 144.0f)
                lineTo(181.42f, 144.0f)
                lineToRelative(-14.0f, 35.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.86f, 0.0f)
                lineTo(128.0f, 117.54f)
                lineTo(103.43f, 179.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.86f, 0.0f)
                lineToRelative(-14.0f, -35.0f)
                lineTo(56.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(68.18f, 128.0f)
                lineTo(56.57f, 99.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 71.43f, 93.0f)
                lineTo(96.0f, 154.46f)
                lineTo(120.57f, 93.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.86f, 0.0f)
                lineTo(160.0f, 154.46f)
                lineTo(184.57f, 93.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 199.43f, 99.0f)
                lineToRelative(-11.61f, 29.0f)
                lineTo(200.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _currencykrw!!
    }

private var _currencykrw: ImageVector? = null
