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

public val DuotoneGroup.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) {
            return _smileyMelting!!
        }
        _smileyMelting = Builder(name = "SmileyMelting", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(95.63f, 95.63f, 0.0f, false, true, -24.44f, 64.0f)
                horizontalLineTo(56.44f)
                arcTo(95.67f, 95.67f, 0.0f, false, true, 32.0f, 126.06f)
                curveTo(33.0f, 74.58f, 75.15f, 32.73f, 126.63f, 32.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 140.0f)
                close()
                moveTo(128.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 92.0f)
                close()
                moveTo(201.0f, 54.0f)
                arcTo(103.24f, 103.24f, 0.0f, false, false, 128.0f, 24.0f)
                horizontalLineToRelative(-1.49f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -76.0f, 173.32f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 62.4f, 186.67f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 131.19f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.93f, 10.66f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 201.0f, 54.0f)
                close()
                moveTo(152.0f, 168.0f)
                lineTo(136.0f, 168.0f)
                curveToRelative(-21.74f, 0.0f, -48.0f, -17.84f, -48.0f, -40.0f)
                arcToRelative(41.33f, 41.33f, 0.0f, false, true, 0.55f, -6.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.78f, -2.64f)
                arcTo(56.9f, 56.9f, 0.0f, false, false, 72.0f, 128.0f)
                curveToRelative(0.0f, 14.88f, 7.46f, 29.13f, 21.0f, 40.15f)
                curveTo(105.4f, 178.22f, 121.07f, 184.0f, 136.0f, 184.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _smileyMelting!!
    }

private var _smileyMelting: ImageVector? = null
