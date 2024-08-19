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

public val DuotoneGroup.Clockcounterclockwise: ImageVector
    get() {
        if (_clockcounterclockwise != null) {
            return _clockcounterclockwise!!
        }
        _clockcounterclockwise = Builder(name = "Clockcounterclockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, -88.0f, -88.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 80.0f)
                verticalLineToRelative(43.47f)
                lineToRelative(36.12f, 21.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.24f, 13.72f)
                lineToRelative(-40.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 128.0f)
                lineTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(128.0f, 32.0f)
                arcTo(95.44f, 95.44f, 0.0f, false, false, 60.08f, 60.15f)
                curveTo(52.81f, 67.51f, 46.35f, 74.59f, 40.0f, 82.0f)
                lineTo(40.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(72.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(49.0f, 96.0f)
                curveToRelative(7.15f, -8.42f, 14.27f, -16.35f, 22.39f, -24.57f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 1.66f, 114.75f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.0f, 11.64f)
                arcTo(96.0f, 96.0f, 0.0f, true, false, 128.0f, 32.0f)
                close()
            }
        }
        .build()
        return _clockcounterclockwise!!
    }

private var _clockcounterclockwise: ImageVector? = null