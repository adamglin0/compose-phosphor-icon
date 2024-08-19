package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Chair: ImageVector
    get() {
        if (_chair != null) {
            return _chair!!
        }
        _chair = Builder(name = "Chair", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 136.0f)
                lineTo(176.0f, 136.0f)
                lineTo(176.0f, 104.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(208.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(64.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 40.0f)
                lineTo(48.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(80.0f, 104.0f)
                verticalLineToRelative(32.0f)
                lineTo(48.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(72.0f, 184.0f)
                lineTo(184.0f, 184.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(200.0f, 184.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 152.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 136.0f)
                close()
                moveTo(64.0f, 40.0f)
                lineTo(192.0f, 40.0f)
                lineTo(192.0f, 88.0f)
                lineTo(64.0f, 88.0f)
                close()
                moveTo(96.0f, 104.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(32.0f)
                lineTo(96.0f, 136.0f)
                close()
                moveTo(208.0f, 168.0f)
                lineTo(48.0f, 168.0f)
                lineTo(48.0f, 152.0f)
                lineTo(208.0f, 152.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _chair!!
    }

private var _chair: ImageVector? = null
