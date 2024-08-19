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

public val DuotoneGroup.Chartlinedown: ImageVector
    get() {
        if (_chartlinedown != null) {
            return _chartlinedown!!
        }
        _chartlinedown = Builder(name = "Chartlinedown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(60.69f)
                lineToRelative(56.0f, 56.0f)
                lineToRelative(26.34f, -26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineTo(192.0f, 148.69f)
                verticalLineTo(128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, 0.8f)
                curveToRelative(0.0f, 0.11f, 0.0f, 0.21f, -0.05f, 0.32f)
                reflectiveCurveToRelative(0.0f, 0.3f, -0.07f, 0.46f)
                arcToRelative(2.83f, 2.83f, 0.0f, false, true, -0.09f, 0.37f)
                curveToRelative(0.0f, 0.13f, -0.06f, 0.26f, -0.1f, 0.39f)
                reflectiveCurveToRelative(-0.08f, 0.23f, -0.12f, 0.35f)
                lineToRelative(-0.14f, 0.39f)
                lineToRelative(-0.15f, 0.31f)
                curveToRelative(-0.06f, 0.13f, -0.12f, 0.27f, -0.19f, 0.4f)
                reflectiveCurveToRelative(-0.11f, 0.18f, -0.16f, 0.28f)
                lineToRelative(-0.24f, 0.39f)
                lineToRelative(-0.21f, 0.28f)
                lineToRelative(-0.26f, 0.35f)
                curveToRelative(-0.11f, 0.14f, -0.24f, 0.27f, -0.36f, 0.4f)
                lineToRelative(-0.16f, 0.18f)
                lineToRelative(-0.17f, 0.15f)
                arcToRelative(4.83f, 4.83f, 0.0f, false, true, -0.42f, 0.37f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -0.32f, 0.25f)
                lineToRelative(-0.3f, 0.22f)
                lineToRelative(-0.38f, 0.23f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, true, -0.3f, 0.17f)
                lineToRelative(-0.37f, 0.19f)
                lineToRelative(-0.34f, 0.15f)
                lineToRelative(-0.36f, 0.13f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, true, -0.38f, 0.13f)
                lineToRelative(-0.36f, 0.1f)
                curveToRelative(-0.14f, 0.0f, -0.26f, 0.07f, -0.4f, 0.09f)
                lineToRelative(-0.42f, 0.07f)
                lineToRelative(-0.35f, 0.05f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.79f, 0.0f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(20.69f)
                lineTo(128.0f, 107.31f)
                lineToRelative(-26.34f, 26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineTo(40.0f, 83.31f)
                verticalLineTo(200.0f)
                horizontalLineTo(224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 208.0f)
                close()
            }
        }
        .build()
        return _chartlinedown!!
    }

private var _chartlinedown: ImageVector? = null
