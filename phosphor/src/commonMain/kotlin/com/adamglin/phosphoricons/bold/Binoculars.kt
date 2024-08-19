package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.0f, 150.65f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, -0.05f)
                arcToRelative(51.33f, 51.33f, 0.0f, false, false, -2.53f, -5.9f)
                lineTo(196.93f, 50.18f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.5f, -3.65f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.92f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 55.0f)
                verticalLineTo(76.0f)
                horizontalLineTo(116.0f)
                verticalLineTo(55.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.51f, -8.48f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.92f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.5f, 3.65f)
                lineTo(17.53f, 144.7f)
                arcTo(51.33f, 51.33f, 0.0f, false, false, 15.0f, 150.6f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.05f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 116.0f, 168.0f)
                verticalLineTo(100.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 101.0f, -17.35f)
                close()
                moveTo(80.0f, 62.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -1.22f)
                verticalLineToRelative(63.15f)
                arcToRelative(51.9f, 51.9f, 0.0f, false, false, -35.9f, -7.62f)
                close()
                moveTo(64.0f, 196.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 64.0f, 196.0f)
                close()
                moveTo(164.0f, 61.06f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, true, 12.0f, 1.22f)
                lineToRelative(23.87f, 54.31f)
                arcToRelative(51.9f, 51.9f, 0.0f, false, false, -35.9f, 7.62f)
                close()
                moveTo(192.0f, 196.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 192.0f, 196.0f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
