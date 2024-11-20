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

public val BoldGroup.Chair: ImageVector
    get() {
        if (_chair != null) {
            return _chair!!
        }
        _chair = Builder(name = "Chair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 128.0f)
                lineTo(180.0f, 128.0f)
                lineTo(180.0f, 108.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(212.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(64.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 40.0f)
                lineTo(44.0f, 88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(76.0f, 108.0f)
                verticalLineToRelative(20.0f)
                lineTo(48.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(80.0f, 192.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(200.0f, 192.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 148.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 128.0f)
                close()
                moveTo(68.0f, 44.0f)
                lineTo(188.0f, 44.0f)
                lineTo(188.0f, 84.0f)
                lineTo(68.0f, 84.0f)
                close()
                moveTo(100.0f, 108.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(20.0f)
                lineTo(100.0f, 128.0f)
                close()
                moveTo(204.0f, 168.0f)
                lineTo(52.0f, 168.0f)
                lineTo(52.0f, 152.0f)
                lineTo(204.0f, 152.0f)
                close()
            }
        }
        .build()
        return _chair!!
    }

private var _chair: ImageVector? = null
