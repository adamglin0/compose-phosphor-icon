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

public val BoldGroup.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) {
            return _megaphoneSimple!!
        }
        _megaphoneSimple = Builder(name = "MegaphoneSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.7f, 82.84f)
                lineToRelative(-175.94f, -54.0f)
                lineToRelative(-0.16f, -0.05f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.94f, 20.0f)
                arcToRelative(20.38f, 20.38f, 0.0f, false, false, 5.66f, -0.81f)
                lineToRelative(0.16f, 0.0f)
                lineToRelative(78.24f, -24.0f)
                lineTo(132.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(204.0f, 165.06f)
                lineToRelative(25.7f, -7.89f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 244.0f, 138.0f)
                lineTo(244.0f, 102.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 229.7f, 82.84f)
                close()
                moveTo(52.0f, 186.58f)
                lineTo(52.0f, 53.43f)
                lineTo(132.0f, 78.0f)
                lineTo(132.0f, 162.0f)
                close()
                moveTo(180.0f, 192.0f)
                lineTo(156.0f, 192.0f)
                lineTo(156.0f, 179.78f)
                lineToRelative(24.0f, -7.36f)
                close()
                moveTo(220.0f, 135.05f)
                lineTo(156.0f, 154.68f)
                lineTo(156.0f, 85.33f)
                lineTo(220.0f, 105.0f)
                close()
            }
        }
        .build()
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
