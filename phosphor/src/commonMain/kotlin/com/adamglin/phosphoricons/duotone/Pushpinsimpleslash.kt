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

public val DuotoneGroup.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) {
            return _pushPinSimpleSlash!!
        }
        _pushPinSimpleSlash = Builder(name = "PushPinSimpleSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(190.46f, 176.0f)
                horizontalLineTo(56.0f)
                lineTo(78.83f, 46.61f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 86.71f, 40.0f)
                horizontalLineTo(176.0f)
                lineToRelative(22.34f, 126.61f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 190.46f, 176.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.25f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-6.46f)
                lineToRelative(18.75f, 106.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.48f, 9.26f)
                arcToRelative(7.52f, 7.52f, 0.0f, false, true, -1.4f, 0.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.87f, -6.61f)
                lineTo(169.29f, 48.0f)
                horizontalLineToRelative(-78.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 83.25f, 40.0f)
                close()
                moveTo(213.38f, 221.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.54f)
                lineTo(168.1f, 184.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(184.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(9.29f)
                lineTo(66.24f, 72.0f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                lineToRelative(160.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.38f, 221.92f)
                close()
                moveTo(153.55f, 168.0f)
                lineTo(79.84f, 86.92f)
                lineTo(65.54f, 168.0f)
                close()
            }
        }
        .build()
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
