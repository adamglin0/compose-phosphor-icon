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

public val DuotoneGroup.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) {
            return _smileySticker!!
        }
        _smileySticker = Builder(name = "SmileySticker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(95.91f, 95.91f, 0.0f, false, true, -4.21f, 28.21f)
                lineToRelative(-63.57f, 63.58f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.92f, 156.0f)
                curveToRelative(-10.29f, 17.79f, -27.39f, 28.0f, -46.92f, 28.0f)
                reflectiveCurveToRelative(-36.63f, -10.2f, -46.92f, -28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.84f, -8.0f)
                curveToRelative(7.47f, 12.91f, 19.21f, 20.0f, 33.08f, 20.0f)
                reflectiveCurveToRelative(25.61f, -7.1f, 33.08f, -20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.84f, 8.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcToRelative(104.35f, 104.35f, 0.0f, false, true, -4.56f, 30.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.0f, 3.31f)
                lineToRelative(-63.57f, 63.57f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.3f, 2.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 232.0f, 128.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(87.89f, 87.89f, 0.0f, true, false, -64.0f, 84.69f)
                lineTo(212.69f, 152.0f)
                arcTo(88.05f, 88.05f, 0.0f, false, false, 216.0f, 128.0f)
                close()
                moveTo(92.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 120.0f)
                close()
                moveTo(164.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 96.0f)
                close()
            }
        }
        .build()
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
