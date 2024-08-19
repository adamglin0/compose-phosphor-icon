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

public val DuotoneGroup.Paintbrushbroad: ImageVector
    get() {
        if (_paintbrushbroad != null) {
            return _paintbrushbroad!!
        }
        _paintbrushbroad = Builder(name = "Paintbrushbroad", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 112.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.92f, 9.13f)
                lineTo(152.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                lineToRelative(7.92f, -46.87f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 152.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 24.0f)
                horizontalLineTo(72.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 32.0f, 64.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(48.0f)
                lineToRelative(-7.89f, 46.67f)
                arcTo(8.42f, 8.42f, 0.0f, false, false, 96.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(8.42f, 8.42f, 0.0f, false, false, -0.11f, -1.33f)
                lineTo(152.0f, 160.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 24.0f)
                close()
                moveTo(72.0f, 40.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(40.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 72.0f, 40.0f)
                close()
                moveTo(200.0f, 144.0f)
                horizontalLineTo(152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.84f, 18.26f)
                lineToRelative(0.0f, 0.2f)
                lineTo(144.0f, 208.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineToRelative(7.8f, -46.14f)
                lineToRelative(0.0f, -0.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 104.0f, 144.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(120.0f)
                horizontalLineTo(208.0f)
                verticalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 144.0f)
                close()
            }
        }
        .build()
        return _paintbrushbroad!!
    }

private var _paintbrushbroad: ImageVector? = null
