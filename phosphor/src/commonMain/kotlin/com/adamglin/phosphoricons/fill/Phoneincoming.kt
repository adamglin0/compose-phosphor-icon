package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.PhoneIncoming: ImageVector
    get() {
        if (_phoneIncoming != null) {
            return _phoneIncoming!!
        }
        _phoneIncoming = Builder(name = "PhoneIncoming", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.88f, 183.08f)
                arcTo(56.26f, 56.26f, 0.0f, false, true, 168.0f, 232.0f)
                curveTo(88.6f, 232.0f, 24.0f, 167.4f, 24.0f, 88.0f)
                arcTo(56.26f, 56.26f, 0.0f, false, true, 72.92f, 32.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.62f, 9.52f)
                lineToRelative(21.12f, 47.15f)
                lineToRelative(0.0f, 0.12f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 109.39f, 104.0f)
                curveToRelative(-0.18f, 0.27f, -0.37f, 0.52f, -0.57f, 0.77f)
                lineTo(88.0f, 129.45f)
                curveToRelative(7.49f, 15.22f, 23.41f, 31.0f, 38.83f, 38.51f)
                lineToRelative(24.34f, -20.71f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, true, 0.75f, -0.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.17f, -1.4f)
                lineToRelative(0.13f, 0.06f)
                lineToRelative(47.11f, 21.11f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 223.88f, 183.08f)
                close()
                moveTo(152.0f, 112.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(171.32f)
                lineToRelative(34.34f, -34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(160.0f, 84.69f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 112.0f)
                close()
            }
        }
        .build()
        return _phoneIncoming!!
    }

private var _phoneIncoming: ImageVector? = null
