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

public val FillGroup.Currencyngn: ImageVector
    get() {
        if (_currencyngn != null) {
            return _currencyngn!!
        }
        _currencyngn = Builder(name = "Currencyngn", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(143.55f, 136.0f)
                lineTo(160.0f, 136.0f)
                verticalLineToRelative(23.0f)
                close()
                moveTo(96.0f, 120.0f)
                horizontalLineToRelative(16.45f)
                lineTo(96.0f, 97.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(200.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(176.0f, 120.0f)
                lineTo(176.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(48.0f)
                lineTo(132.12f, 120.0f)
                lineTo(94.51f, 67.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 72.0f)
                verticalLineToRelative(48.0f)
                lineTo(64.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(80.0f, 136.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(96.0f, 136.0f)
                horizontalLineToRelative(27.88f)
                lineToRelative(37.61f, 52.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 192.0f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, false, 2.44f, -0.38f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 184.0f)
                lineTo(176.0f, 136.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 128.0f)
                close()
            }
        }
        .build()
        return _currencyngn!!
    }

private var _currencyngn: ImageVector? = null
