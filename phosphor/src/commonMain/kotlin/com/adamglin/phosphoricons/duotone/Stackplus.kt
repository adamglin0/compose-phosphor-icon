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

public val DuotoneGroup.Stackplus: ImageVector
    get() {
        if (_stackplus != null) {
            return _stackplus!!
        }
        _stackplus = Builder(name = "Stackplus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 80.0f)
                lineToRelative(-96.0f, 56.0f)
                lineTo(32.0f, 80.0f)
                lineToRelative(96.0f, -56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(216.0f, 208.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(200.0f, 208.0f)
                lineTo(184.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(200.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 200.0f)
                close()
                moveTo(220.0f, 121.09f)
                lineTo(128.0f, 174.74f)
                lineTo(36.0f, 121.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 28.0f, 134.91f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.06f, 0.0f)
                lineToRelative(96.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 220.0f, 121.09f)
                close()
                moveTo(24.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.0f, -6.91f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.06f, 0.0f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 13.82f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.06f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 80.0f)
                close()
                moveTo(47.88f, 80.0f)
                lineTo(128.0f, 126.74f)
                lineTo(208.12f, 80.0f)
                lineTo(128.0f, 33.26f)
                close()
                moveTo(140.0f, 215.76f)
                lineToRelative(-12.0f, 7.0f)
                lineTo(36.0f, 169.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 28.0f, 182.91f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.06f, 0.0f)
                lineToRelative(16.0f, -9.33f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 140.0f, 215.76f)
                close()
            }
        }
        .build()
        return _stackplus!!
    }

private var _stackplus: ImageVector? = null
