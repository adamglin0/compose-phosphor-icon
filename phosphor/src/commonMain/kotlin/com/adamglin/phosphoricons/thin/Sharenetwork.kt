package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Sharenetwork: ImageVector
    get() {
        if (_sharenetwork != null) {
            return _sharenetwork!!
        }
        _sharenetwork = Builder(name = "Sharenetwork", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -27.92f, 13.3f)
                lineTo(96.25f, 144.0f)
                arcToRelative(35.92f, 35.92f, 0.0f, false, false, 0.0f, -32.0f)
                lineTo(148.08f, 78.7f)
                arcTo(35.93f, 35.93f, 0.0f, true, false, 143.75f, 72.0f)
                lineTo(91.92f, 105.3f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 0.0f, 45.4f)
                lineTo(143.75f, 184.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 176.0f, 164.0f)
                close()
                moveTo(176.0f, 28.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 176.0f, 28.0f)
                close()
                moveTo(64.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 64.0f, 156.0f)
                close()
                moveTo(176.0f, 228.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 176.0f, 228.0f)
                close()
            }
        }
        .build()
        return _sharenetwork!!
    }

private var _sharenetwork: ImageVector? = null
