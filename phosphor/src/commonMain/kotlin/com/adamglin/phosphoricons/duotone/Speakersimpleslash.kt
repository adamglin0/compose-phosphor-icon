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

public val DuotoneGroup.Speakersimpleslash: ImageVector
    get() {
        if (_speakersimpleslash != null) {
            return _speakersimpleslash!!
        }
        _speakersimpleslash = Builder(name = "Speakersimpleslash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 32.0f)
                verticalLineTo(224.0f)
                lineTo(88.0f, 168.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 152.0f)
                lineTo(192.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(232.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(240.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 80.0f)
                close()
                moveTo(221.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(168.0f, 175.09f)
                lineTo(168.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.91f, 6.31f)
                lineTo(85.25f, 176.0f)
                lineTo(40.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 80.0f)
                lineTo(81.55f, 80.0f)
                lineTo(50.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 61.92f, 34.62f)
                close()
                moveTo(152.0f, 157.49f)
                lineTo(96.1f, 96.0f)
                lineTo(40.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineTo(88.0f, 160.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 4.91f, 1.69f)
                lineTo(152.0f, 207.64f)
                close()
                moveTo(125.06f, 69.31f)
                lineToRelative(26.94f, -21.0f)
                verticalLineToRelative(58.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(168.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.91f, -6.31f)
                lineToRelative(-39.85f, 31.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.82f, 12.63f)
                close()
            }
        }
        .build()
        return _speakersimpleslash!!
    }

private var _speakersimpleslash: ImageVector? = null
