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

public val DuotoneGroup.Chartdonut: ImageVector
    get() {
        if (_chartdonut != null) {
            return _chartdonut!!
        }
        _chartdonut = Builder(name = "Chartdonut", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, -96.0f, 96.0f)
                verticalLineTo(168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -80.0f)
                verticalLineTo(32.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(120.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -27.72f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.93f, -10.93f)
                lineToRelative(-48.5f, -28.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 37.92f, 76.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 128.0f, 24.0f)
                close()
                moveTo(48.09f, 91.1f)
                lineTo(83.0f, 111.26f)
                arcTo(48.09f, 48.09f, 0.0f, false, false, 80.0f, 128.0f)
                curveToRelative(0.0f, 1.53f, 0.08f, 3.0f, 0.22f, 4.52f)
                lineTo(41.28f, 143.0f)
                arcTo(88.16f, 88.16f, 0.0f, false, true, 48.09f, 91.1f)
                close()
                moveTo(45.42f, 158.41f)
                lineTo(84.42f, 147.97f)
                arcTo(48.1f, 48.1f, 0.0f, false, false, 120.0f, 175.32f)
                verticalLineToRelative(40.31f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 45.42f, 158.41f)
                close()
                moveTo(136.0f, 215.63f)
                lineTo(136.0f, 175.32f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -94.65f)
                lineTo(136.0f, 40.36f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 0.0f, 175.27f)
                close()
            }
        }
        .build()
        return _chartdonut!!
    }

private var _chartdonut: ImageVector? = null
