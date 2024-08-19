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

public val BoldGroup.Sharenetwork: ImageVector
    get() {
        if (_sharenetwork != null) {
            return _sharenetwork!!
        }
        _sharenetwork = Builder(name = "Sharenetwork", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 156.0f)
                arcToRelative(43.78f, 43.78f, 0.0f, false, false, -29.09f, 11.0f)
                lineTo(106.1f, 140.8f)
                arcToRelative(44.07f, 44.07f, 0.0f, false, false, 0.0f, -25.6f)
                lineTo(146.91f, 89.0f)
                arcToRelative(43.83f, 43.83f, 0.0f, true, false, -13.0f, -20.17f)
                lineTo(93.09f, 95.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.0f, 65.94f)
                lineTo(133.9f, 187.2f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 176.0f, 156.0f)
                close()
                moveTo(176.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 36.0f)
                close()
                moveTo(64.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 64.0f, 148.0f)
                close()
                moveTo(176.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 220.0f)
                close()
            }
        }
        .build()
        return _sharenetwork!!
    }

private var _sharenetwork: ImageVector? = null
