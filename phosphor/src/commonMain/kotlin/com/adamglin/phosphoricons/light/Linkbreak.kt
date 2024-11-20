package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) {
            return _linkBreak!!
        }
        _linkBreak = Builder(name = "LinkBreak", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 56.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -48.0f, -0.05f)
                lineTo(140.34f, 68.14f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.68f, -8.28f)
                lineToRelative(11.71f, -12.28f)
                lineToRelative(0.1f, -0.11f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 65.06f, 65.06f)
                lineToRelative(-0.11f, 0.1f)
                lineToRelative(-12.28f, 11.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.28f, -8.68f)
                lineTo(200.09f, 104.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 200.0f, 56.0f)
                close()
                moveTo(115.62f, 187.9f)
                lineTo(104.0f, 200.09f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 55.91f, 152.0f)
                lineToRelative(12.23f, -11.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.28f, -8.68f)
                lineTo(47.58f, 143.37f)
                lineToRelative(-0.11f, 0.1f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 65.06f, 65.06f)
                lineToRelative(0.1f, -0.11f)
                lineToRelative(11.71f, -12.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.68f, -8.28f)
                close()
                moveTo(216.0f, 154.0f)
                lineTo(192.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(40.0f, 102.0f)
                lineTo(64.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(40.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(160.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(166.0f, 192.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 186.0f)
                close()
                moveTo(96.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(102.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(90.0f, 64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 70.0f)
                close()
            }
        }
        .build()
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
