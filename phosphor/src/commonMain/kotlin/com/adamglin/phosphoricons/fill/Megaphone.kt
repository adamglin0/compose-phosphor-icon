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

public val FillGroup.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 72.0f)
                horizontalLineTo(160.2f)
                curveToRelative(-2.91f, -0.17f, -53.62f, -3.74f, -101.91f, -44.24f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 40.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 26.29f, 12.25f)
                curveToRelative(37.77f, -31.68f, 77.0f, -40.76f, 93.71f, -43.3f)
                verticalLineToRelative(31.72f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 159.12f, 214.0f)
                lineToRelative(11.0f, 7.33f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 194.5f, 212.0f)
                lineToRelative(11.77f, -44.36f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 200.0f, 72.0f)
                close()
                moveTo(179.0f, 207.89f)
                lineToRelative(0.0f, 0.11f)
                lineToRelative(-11.0f, -7.33f)
                verticalLineTo(168.0f)
                horizontalLineToRelative(21.6f)
                close()
                moveTo(200.0f, 152.0f)
                horizontalLineTo(168.0f)
                verticalLineTo(88.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
