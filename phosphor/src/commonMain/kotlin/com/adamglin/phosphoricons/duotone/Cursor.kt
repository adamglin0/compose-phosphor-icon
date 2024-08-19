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

public val DuotoneGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(213.66f, 201.0f)
                lineTo(201.0f, 213.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineToRelative(-51.31f, -51.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.0f, 2.46f)
                lineToRelative(-17.82f, 46.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.85f, -0.71f)
                lineTo(40.41f, 50.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, -10.0f)
                lineTo(210.51f, 92.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.71f, 14.85f)
                lineToRelative(-46.41f, 17.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.46f, 13.0f)
                lineToRelative(51.31f, 51.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.66f, 201.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 132.69f)
                lineTo(214.08f, 115.0f)
                lineToRelative(0.33f, -0.13f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 213.0f, 85.07f)
                lineTo(52.92f, 32.8f)
                arcTo(15.95f, 15.95f, 0.0f, false, false, 32.8f, 52.92f)
                lineTo(85.07f, 213.0f)
                arcToRelative(15.82f, 15.82f, 0.0f, false, false, 14.41f, 11.0f)
                lineToRelative(0.78f, 0.0f)
                arcToRelative(15.84f, 15.84f, 0.0f, false, false, 14.61f, -9.59f)
                lineToRelative(0.13f, -0.33f)
                lineTo(132.69f, 168.0f)
                lineTo(184.0f, 219.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(12.68f, -12.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                close()
                moveTo(195.31f, 208.0f)
                lineTo(144.0f, 156.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -26.0f, 4.93f)
                curveToRelative(0.0f, 0.11f, -0.09f, 0.22f, -0.13f, 0.32f)
                lineToRelative(-17.65f, 46.0f)
                lineTo(48.0f, 48.0f)
                lineToRelative(159.85f, 52.2f)
                lineToRelative(-45.95f, 17.64f)
                lineToRelative(-0.32f, 0.13f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -4.93f, 26.0f)
                horizontalLineToRelative(0.0f)
                lineTo(208.0f, 195.31f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
