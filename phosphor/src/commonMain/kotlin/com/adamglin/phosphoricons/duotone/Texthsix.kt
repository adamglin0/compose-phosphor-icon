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

public val DuotoneGroup.TextHSix: ImageVector
    get() {
        if (_textHSix != null) {
            return _textHSix!!
        }
        _textHSix = Builder(name = "TextHSix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 72.0f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(56.0f)
                horizontalLineTo(224.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 56.0f)
                lineTo(152.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(136.0f, 124.0f)
                lineTo(48.0f, 124.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(32.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(88.0f)
                lineTo(136.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(248.0f, 180.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -67.34f, -17.68f)
                curveToRelative(0.07f, -0.14f, 0.14f, -0.28f, 0.22f, -0.42f)
                lineToRelative(32.25f, -54.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.74f, 8.2f)
                lineToRelative(-16.69f, 28.0f)
                curveToRelative(0.6f, 0.0f, 1.21f, -0.05f, 1.82f, -0.05f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 248.0f, 180.0f)
                close()
                moveTo(232.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 232.0f, 180.0f)
                close()
            }
        }
        .build()
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
