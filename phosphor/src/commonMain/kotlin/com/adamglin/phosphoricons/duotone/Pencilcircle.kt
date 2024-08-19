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

public val DuotoneGroup.Pencilcircle: ImageVector
    get() {
        if (_pencilcircle != null) {
            return _pencilcircle!!
        }
        _pencilcircle = Builder(name = "Pencilcircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 211.16f)
                close()
                moveTo(80.0f, 211.16f)
                close()
                moveTo(224.0f, 128.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, false, 80.0f, 211.16f)
                lineTo(80.0f, 176.0f)
                lineTo(128.0f, 72.0f)
                lineToRelative(48.0f, 104.0f)
                verticalLineToRelative(35.16f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.54f, 54.46f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 201.54f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 201.54f, 54.46f)
                close()
                moveTo(88.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(23.59f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -32.0f, -9.22f)
                close()
                moveTo(136.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(14.37f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -32.0f, 9.22f)
                close()
                moveTo(107.27f, 136.0f)
                horizontalLineToRelative(41.46f)
                lineToRelative(11.58f, 25.1f)
                arcTo(31.93f, 31.93f, 0.0f, false, false, 128.0f, 170.87f)
                arcToRelative(31.93f, 31.93f, 0.0f, false, false, -32.31f, -9.77f)
                close()
                moveTo(114.66f, 120.0f)
                lineTo(128.0f, 91.09f)
                lineTo(141.34f, 120.0f)
                close()
                moveTo(190.22f, 190.23f)
                curveToRelative(-2.0f, 2.0f, -4.08f, 3.87f, -6.22f, 5.64f)
                lineTo(184.0f, 176.0f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, false, -0.74f, -3.35f)
                lineToRelative(-48.0f, -104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.52f, 0.0f)
                lineToRelative(-48.0f, 104.0f)
                arcTo(7.91f, 7.91f, 0.0f, false, false, 72.0f, 176.0f)
                verticalLineToRelative(19.87f)
                curveToRelative(-2.14f, -1.77f, -4.22f, -3.64f, -6.22f, -5.64f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 124.44f, 0.0f)
                close()
            }
        }
        .build()
        return _pencilcircle!!
    }

private var _pencilcircle: ImageVector? = null
