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

public val DuotoneGroup.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) {
            return _bracketsCurly!!
        }
        _bracketsCurly = Builder(name = "BracketsCurly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                curveToRelative(-64.0f, 0.0f, 0.0f, 88.0f, -64.0f, 88.0f)
                horizontalLineTo(80.0f)
                curveToRelative(-64.0f, 0.0f, 0.0f, -88.0f, -64.0f, -88.0f)
                curveToRelative(64.0f, 0.0f, 0.0f, -88.0f, 64.0f, -88.0f)
                horizontalLineToRelative(96.0f)
                curveTo(240.0f, 40.0f, 176.0f, 128.0f, 240.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.18f, 128.0f)
                arcToRelative(29.78f, 29.78f, 0.0f, false, true, 8.0f, 10.26f)
                curveToRelative(4.8f, 9.9f, 4.8f, 22.0f, 4.8f, 33.74f)
                curveToRelative(0.0f, 24.31f, 1.0f, 36.0f, 24.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                curveToRelative(-17.48f, 0.0f, -29.32f, -6.14f, -35.2f, -18.26f)
                curveToRelative(-4.8f, -9.9f, -4.8f, -22.0f, -4.8f, -33.74f)
                curveToRelative(0.0f, -24.31f, -1.0f, -36.0f, -24.0f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                curveToRelative(23.0f, 0.0f, 24.0f, -11.69f, 24.0f, -36.0f)
                curveToRelative(0.0f, -11.72f, 0.0f, -23.84f, 4.8f, -33.74f)
                curveTo(50.68f, 38.14f, 62.52f, 32.0f, 80.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                curveTo(57.0f, 48.0f, 56.0f, 59.69f, 56.0f, 84.0f)
                curveToRelative(0.0f, 11.72f, 0.0f, 23.84f, -4.8f, 33.74f)
                arcTo(29.78f, 29.78f, 0.0f, false, true, 43.18f, 128.0f)
                close()
                moveTo(240.0f, 120.0f)
                curveToRelative(-23.0f, 0.0f, -24.0f, -11.69f, -24.0f, -36.0f)
                curveToRelative(0.0f, -11.72f, 0.0f, -23.84f, -4.8f, -33.74f)
                curveTo(205.32f, 38.14f, 193.48f, 32.0f, 176.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                curveToRelative(23.0f, 0.0f, 24.0f, 11.69f, 24.0f, 36.0f)
                curveToRelative(0.0f, 11.72f, 0.0f, 23.84f, 4.8f, 33.74f)
                arcToRelative(29.78f, 29.78f, 0.0f, false, false, 8.0f, 10.26f)
                arcToRelative(29.78f, 29.78f, 0.0f, false, false, -8.0f, 10.26f)
                curveToRelative(-4.8f, 9.9f, -4.8f, 22.0f, -4.8f, 33.74f)
                curveToRelative(0.0f, 24.31f, -1.0f, 36.0f, -24.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                curveToRelative(17.48f, 0.0f, 29.32f, -6.14f, 35.2f, -18.26f)
                curveToRelative(4.8f, -9.9f, 4.8f, -22.0f, 4.8f, -33.74f)
                curveToRelative(0.0f, -24.31f, 1.0f, -36.0f, 24.0f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
