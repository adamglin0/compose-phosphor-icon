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

public val BoldGroup.Virus: ImageVector
    get() {
        if (_virus != null) {
            return _virus!!
        }
        _virus = Builder(name = "Virus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 128.0f)
                close()
                moveTo(168.0f, 108.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 168.0f, 108.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(252.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(227.28f, 140.0f)
                arcToRelative(99.62f, 99.62f, 0.0f, false, true, -20.62f, 49.69f)
                lineToRelative(9.83f, 9.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineToRelative(-9.82f, -9.83f)
                arcTo(99.62f, 99.62f, 0.0f, false, true, 140.0f, 227.28f)
                lineTo(140.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 227.28f)
                arcToRelative(99.62f, 99.62f, 0.0f, false, true, -49.69f, -20.62f)
                lineToRelative(-9.82f, 9.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(9.83f, -9.82f)
                arcTo(99.62f, 99.62f, 0.0f, false, true, 28.72f, 140.0f)
                lineTo(16.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(28.72f, 116.0f)
                arcTo(99.62f, 99.62f, 0.0f, false, true, 49.34f, 66.31f)
                lineToRelative(-9.83f, -9.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineToRelative(9.82f, 9.83f)
                arcTo(99.62f, 99.62f, 0.0f, false, true, 116.0f, 28.72f)
                lineTo(116.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(140.0f, 28.72f)
                arcToRelative(99.62f, 99.62f, 0.0f, false, true, 49.69f, 20.62f)
                lineToRelative(9.82f, -9.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-9.83f, 9.82f)
                arcTo(99.62f, 99.62f, 0.0f, false, true, 227.28f, 116.0f)
                lineTo(240.0f, 116.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 128.0f)
                close()
                moveTo(204.0f, 128.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -76.0f, 76.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, false, 204.0f, 128.0f)
                close()
            }
        }
        .build()
        return _virus!!
    }

private var _virus: ImageVector? = null
