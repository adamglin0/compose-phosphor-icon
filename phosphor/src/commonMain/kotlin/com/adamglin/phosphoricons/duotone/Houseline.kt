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

public val DuotoneGroup.Houseline: ImageVector
    get() {
        if (_houseline != null) {
            return _houseline!!
        }
        _houseline = Builder(name = "Houseline", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 116.69f)
                verticalLineTo(216.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(152.0f)
                horizontalLineTo(104.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(116.69f)
                lineToRelative(82.34f, -82.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 208.0f)
                lineTo(224.0f, 208.0f)
                lineTo(224.0f, 136.0f)
                lineToRelative(2.34f, 2.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 127.0f)
                lineTo(139.31f, 28.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineTo(18.34f, 127.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.31f)
                lineTo(32.0f, 136.0f)
                verticalLineToRelative(72.0f)
                lineTo(16.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(48.0f, 120.0f)
                lineToRelative(80.0f, -80.0f)
                lineToRelative(80.0f, 80.0f)
                verticalLineToRelative(88.0f)
                lineTo(160.0f, 208.0f)
                lineTo(160.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(104.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                lineTo(48.0f, 208.0f)
                close()
                moveTo(144.0f, 208.0f)
                lineTo(112.0f, 208.0f)
                lineTo(112.0f, 160.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _houseline!!
    }

private var _houseline: ImageVector? = null
