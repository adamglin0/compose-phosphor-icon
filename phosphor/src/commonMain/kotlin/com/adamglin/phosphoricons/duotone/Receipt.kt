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

public val DuotoneGroup.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 56.0f)
                verticalLineTo(208.0f)
                lineToRelative(-32.0f, -16.0f)
                lineToRelative(-32.0f, 16.0f)
                lineToRelative(-32.0f, -16.0f)
                lineTo(96.0f, 208.0f)
                lineTo(64.0f, 192.0f)
                lineTo(32.0f, 208.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(80.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 104.0f)
                close()
                moveTo(80.0f, 144.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(80.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.58f, 7.15f)
                lineTo(192.0f, 200.94f)
                lineToRelative(-28.42f, 14.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, 0.0f)
                lineTo(128.0f, 200.94f)
                lineTo(99.58f, 215.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, 0.0f)
                lineTo(64.0f, 200.94f)
                lineTo(35.58f, 215.15f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 208.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(216.0f, 56.0f)
                lineTo(40.0f, 56.0f)
                lineTo(40.0f, 195.06f)
                lineToRelative(20.42f, -10.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.16f, 0.0f)
                lineTo(96.0f, 199.06f)
                lineToRelative(28.42f, -14.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.16f, 0.0f)
                lineTo(160.0f, 199.06f)
                lineToRelative(28.42f, -14.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.16f, 0.0f)
                lineTo(216.0f, 195.06f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
