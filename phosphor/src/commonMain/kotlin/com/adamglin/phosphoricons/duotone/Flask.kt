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

public val DuotoneGroup.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 216.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.86f, -12.12f)
                lineToRelative(30.48f, -50.8f)
                horizontalLineToRelative(0.0f)
                curveToRelative(13.23f, -2.48f, 32.0f, -1.41f, 56.37f, 10.92f)
                curveToRelative(32.25f, 16.33f, 54.75f, 12.91f, 67.5f, 7.65f)
                horizontalLineToRelative(0.0f)
                lineToRelative(19.34f, 32.23f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 216.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.69f, 199.77f)
                lineTo(160.0f, 96.92f)
                verticalLineTo(40.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(96.92f)
                lineTo(34.31f, 199.77f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 224.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.72f, -24.23f)
                close()
                moveTo(110.86f, 103.25f)
                arcTo(7.93f, 7.93f, 0.0f, false, false, 112.0f, 99.14f)
                verticalLineTo(40.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(99.14f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 1.14f, 4.11f)
                lineTo(183.36f, 167.0f)
                curveToRelative(-12.0f, 2.37f, -29.07f, 1.37f, -51.75f, -10.11f)
                curveToRelative(-15.91f, -8.05f, -31.05f, -12.32f, -45.22f, -12.81f)
                close()
                moveTo(48.0f, 208.0f)
                lineToRelative(28.54f, -47.58f)
                curveToRelative(14.25f, -1.73f, 30.31f, 1.85f, 47.82f, 10.72f)
                curveToRelative(19.0f, 9.61f, 35.0f, 12.88f, 48.0f, 12.88f)
                arcToRelative(69.89f, 69.89f, 0.0f, false, false, 19.55f, -2.7f)
                lineTo(208.0f, 208.0f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
