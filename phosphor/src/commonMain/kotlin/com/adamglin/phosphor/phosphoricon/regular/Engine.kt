package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Engine: ImageVector
    get() {
        if (_engine != null) {
            return _engine!!
        }
        _engine = Builder(name = "Engine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 104.0f)
                lineTo(227.31f, 104.0f)
                lineTo(192.0f, 68.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 180.69f, 64.0f)
                lineTo(140.0f, 64.0f)
                lineTo(140.0f, 40.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(100.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                lineTo(124.0f, 64.0f)
                lineTo(64.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 80.0f)
                verticalLineToRelative(52.0f)
                lineTo(24.0f, 132.0f)
                lineTo(24.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(24.0f, 148.0f)
                lineTo(48.0f, 148.0f)
                verticalLineToRelative(20.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 52.69f, 180.0f)
                lineTo(92.0f, 219.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 103.31f, 224.0f)
                horizontalLineToRelative(77.38f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 192.0f, 219.31f)
                lineTo(227.31f, 184.0f)
                lineTo(240.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(256.0f, 120.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 240.0f, 104.0f)
                close()
                moveTo(240.0f, 168.0f)
                lineTo(224.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f)
                lineTo(180.69f, 208.0f)
                lineTo(103.31f, 208.0f)
                lineTo(64.0f, 168.69f)
                lineTo(64.0f, 80.0f)
                lineTo(180.69f, 80.0f)
                lineToRelative(37.65f, 37.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 120.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _engine!!
    }

private var _engine: ImageVector? = null
