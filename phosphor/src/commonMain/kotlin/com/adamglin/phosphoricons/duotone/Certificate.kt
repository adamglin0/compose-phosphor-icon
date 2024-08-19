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

public val DuotoneGroup.Certificate: ImageVector
    get() {
        if (_certificate != null) {
            return _certificate!!
        }
        _certificate = Builder(name = "Certificate", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 56.0f)
                verticalLineTo(90.06f)
                horizontalLineToRelative(0.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -56.0f, 67.88f)
                horizontalLineToRelative(0.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(72.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 136.0f)
                close()
                moveTo(120.0f, 96.0f)
                lineTo(72.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(232.0f, 161.47f)
                lineTo(232.0f, 224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 220.0f, 231.0f)
                lineToRelative(-24.0f, -13.74f)
                lineTo(172.0f, 231.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 224.0f)
                lineTo(160.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(232.0f, 86.53f)
                arcToRelative(51.88f, 51.88f, 0.0f, false, true, 0.0f, 74.94f)
                close()
                moveTo(160.0f, 184.0f)
                lineTo(160.0f, 161.47f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 216.0f, 76.0f)
                lineTo(216.0f, 56.0f)
                lineTo(40.0f, 56.0f)
                lineTo(40.0f, 184.0f)
                close()
                moveTo(216.0f, 172.0f)
                arcToRelative(51.88f, 51.88f, 0.0f, false, true, -40.0f, 0.0f)
                verticalLineToRelative(38.22f)
                lineToRelative(16.0f, -9.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.94f, 0.0f)
                lineToRelative(16.0f, 9.16f)
                close()
                moveTo(232.0f, 124.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 232.0f, 124.0f)
                close()
            }
        }
        .build()
        return _certificate!!
    }

private var _certificate: ImageVector? = null
