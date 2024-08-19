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

public val LightGroup.Arrowbenddoubleupright: ImageVector
    get() {
        if (_arrowbenddoubleupright != null) {
            return _arrowbenddoubleupright!!
        }
        _arrowbenddoubleupright = Builder(name = "Arrowbenddoubleupright", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.24f, 108.24f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(215.51f, 104.0f)
                lineTo(171.76f, 60.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineToRelative(48.0f, 48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 228.24f, 108.24f)
                close()
                moveTo(180.24f, 99.76f)
                lineTo(132.24f, 51.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, 8.48f)
                lineTo(161.51f, 98.0f)
                lineTo(128.0f, 98.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 26.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, true, 90.0f, -90.0f)
                horizontalLineToRelative(33.51f)
                lineToRelative(-37.75f, 37.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(48.0f, -48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 180.24f, 99.76f)
                close()
            }
        }
        .build()
        return _arrowbenddoubleupright!!
    }

private var _arrowbenddoubleupright: ImageVector? = null
