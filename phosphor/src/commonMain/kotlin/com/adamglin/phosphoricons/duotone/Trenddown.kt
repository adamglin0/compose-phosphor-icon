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

public val DuotoneGroup.TrendDown: ImageVector
    get() {
        if (_trendDown != null) {
            return _trendDown!!
        }
        _trendDown = Builder(name = "TrendDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.06f, 120.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineTo(200.0f, 148.69f)
                lineTo(141.66f, 90.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(96.0f, 124.69f)
                lineTo(29.66f, 58.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 18.34f, 69.66f)
                lineToRelative(72.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineTo(136.0f, 107.31f)
                lineTo(188.69f, 160.0f)
                lineToRelative(-26.35f, 26.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 200.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 235.06f, 120.61f)
                close()
                moveTo(224.0f, 184.0f)
                horizontalLineTo(187.31f)
                lineTo(224.0f, 147.31f)
                close()
            }
        }
        .build()
        return _trendDown!!
    }

private var _trendDown: ImageVector? = null
