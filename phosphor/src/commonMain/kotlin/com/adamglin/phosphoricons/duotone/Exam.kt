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

public val DuotoneGroup.Exam: ImageVector
    get() {
        if (_exam != null) {
            return _exam!!
        }
        _exam = Builder(name = "Exam", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 56.0f)
                verticalLineTo(216.0f)
                lineToRelative(-32.0f, -16.0f)
                lineToRelative(-32.0f, 16.0f)
                lineToRelative(-32.0f, -16.0f)
                lineTo(96.0f, 216.0f)
                lineTo(64.0f, 200.0f)
                lineTo(32.0f, 216.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.58f, 7.16f)
                lineTo(64.0f, 208.94f)
                lineToRelative(28.42f, 14.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f)
                lineTo(128.0f, 208.94f)
                lineToRelative(28.42f, 14.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f)
                lineTo(192.0f, 208.94f)
                lineToRelative(28.42f, 14.22f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 216.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(216.0f, 203.06f)
                lineTo(195.58f, 192.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                lineTo(160.0f, 207.06f)
                lineToRelative(-28.42f, -14.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                lineTo(96.0f, 207.06f)
                lineTo(67.58f, 192.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                lineTo(40.0f, 203.06f)
                lineTo(40.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                close()
                moveTo(60.42f, 167.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.74f, -3.58f)
                lineTo(76.94f, 152.0f)
                horizontalLineToRelative(38.12f)
                lineToRelative(5.78f, 11.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.32f, -7.16f)
                lineToRelative(-32.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.32f, 0.0f)
                lineToRelative(-32.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 60.42f, 167.16f)
                close()
                moveTo(96.0f, 113.89f)
                lineTo(107.06f, 136.0f)
                lineTo(84.94f, 136.0f)
                close()
                moveTo(136.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                lineTo(160.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(176.0f, 136.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(160.0f, 136.0f)
                lineTo(144.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 128.0f)
                close()
            }
        }
        .build()
        return _exam!!
    }

private var _exam: ImageVector? = null
