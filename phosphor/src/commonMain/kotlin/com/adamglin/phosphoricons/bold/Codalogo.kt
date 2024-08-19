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

public val BoldGroup.Codalogo: ImageVector
    get() {
        if (_codalogo != null) {
            return _codalogo!!
        }
        _codalogo = Builder(name = "Codalogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 92.0f)
                arcToRelative(35.79f, 35.79f, 0.0f, false, true, 19.38f, 5.47f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 220.0f, 84.0f)
                lineTo(220.0f, 48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(56.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 172.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -24.6f, -13.48f)
                curveToRelative(-6.58f, 4.22f, -11.89f, 5.76f, -18.92f, 5.48f)
                lineTo(176.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, -72.0f)
                close()
                moveTo(175.76f, 188.0f)
                arcTo(52.4f, 52.4f, 0.0f, false, false, 196.0f, 185.0f)
                verticalLineToRelative(19.0f)
                lineTo(60.0f, 204.0f)
                lineTo(60.0f, 52.0f)
                lineTo(196.0f, 52.0f)
                lineTo(196.0f, 71.3f)
                arcTo(61.55f, 61.55f, 0.0f, false, false, 176.0f, 68.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -0.24f, 120.0f)
                close()
            }
        }
        .build()
        return _codalogo!!
    }

private var _codalogo: ImageVector? = null
