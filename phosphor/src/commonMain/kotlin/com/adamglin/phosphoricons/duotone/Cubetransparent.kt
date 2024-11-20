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

public val DuotoneGroup.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) {
            return _cubeTransparent!!
        }
        _cubeTransparent = Builder(name = "CubeTransparent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 96.0f)
                verticalLineTo(216.0f)
                horizontalLineTo(96.0f)
                lineTo(40.0f, 160.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.66f, 90.34f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 32.0f)
                lineTo(40.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(32.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.3f, 5.61f)
                lineToRelative(56.0f, 56.0f)
                horizontalLineToRelative(0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 224.0f)
                lineTo(216.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 221.66f, 90.34f)
                close()
                moveTo(168.0f, 59.31f)
                lineTo(196.69f, 88.0f)
                lineTo(168.0f, 88.0f)
                close()
                moveTo(88.0f, 196.69f)
                lineTo(59.31f, 168.0f)
                lineTo(88.0f, 168.0f)
                close()
                moveTo(88.0f, 152.0f)
                lineTo(48.0f, 152.0f)
                lineTo(48.0f, 59.31f)
                lineToRelative(40.0f, 40.0f)
                close()
                moveTo(59.31f, 48.0f)
                lineTo(152.0f, 48.0f)
                lineTo(152.0f, 88.0f)
                lineTo(99.31f, 88.0f)
                close()
                moveTo(152.0f, 104.0f)
                verticalLineToRelative(48.0f)
                lineTo(104.0f, 152.0f)
                lineTo(104.0f, 104.0f)
                close()
                moveTo(104.0f, 208.0f)
                lineTo(104.0f, 168.0f)
                horizontalLineToRelative(52.69f)
                lineToRelative(40.0f, 40.0f)
                close()
                moveTo(208.0f, 196.69f)
                lineTo(168.0f, 156.69f)
                lineTo(168.0f, 104.0f)
                horizontalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
