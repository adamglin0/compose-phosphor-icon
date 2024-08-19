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

public val LightGroup.Linksimplehorizontalbreak: ImageVector
    get() {
        if (_linksimplehorizontalbreak != null) {
            return _linksimplehorizontalbreak!!
        }
        _linksimplehorizontalbreak = Builder(name = "Linksimplehorizontalbreak", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 128.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 42.0f, 42.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(64.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 64.0f, 74.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(64.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 22.0f, 128.0f)
                close()
                moveTo(192.0f, 74.0f)
                horizontalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 0.0f, 84.0f)
                horizontalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 0.0f, -108.0f)
                close()
            }
        }
        .build()
        return _linksimplehorizontalbreak!!
    }

private var _linksimplehorizontalbreak: ImageVector? = null